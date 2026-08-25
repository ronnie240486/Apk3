package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDocumentReader extends org.bson.AbstractBsonReader {
    private org.bson.BsonValue currentValue;
    private org.bson.BsonDocumentReader.Mark mark;

    /* JADX INFO: renamed from: org.bson.BsonDocumentReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonContextType = null;

        static {
                org.bson.BsonContextType[] r0 = org.bson.BsonContextType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.BsonDocumentReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType = r0
                org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.BsonDocumentReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.BsonDocumentReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static class BsonDocumentMarkableIterator<T> implements java.util.Iterator<T> {
        private java.util.Iterator<T> baseIterator;
        private int curIndex;
        private java.util.List<T> markIterator;
        private boolean marking;

        public BsonDocumentMarkableIterator(java.util.Iterator<T> r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.markIterator = r0
                r1.baseIterator = r2
                r2 = 0
                r1.curIndex = r2
                r1.marking = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.util.Iterator<T> r0 = r2.baseIterator
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L15
                int r0 = r2.curIndex
                java.util.List<T> r1 = r2.markIterator
                int r1 = r1.size()
                if (r0 >= r1) goto L13
                goto L15
            L13:
                r0 = 0
                goto L16
            L15:
                r0 = 1
            L16:
                return r0
        }

        public final void mark() {
                r1 = this;
                r0 = 1
                r1.marking = r0
                return
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.curIndex
                java.util.List<T> r1 = r3.markIterator
                int r1 = r1.size()
                if (r0 >= r1) goto L24
                java.util.List<T> r0 = r3.markIterator
                int r1 = r3.curIndex
                java.lang.Object r0 = r0.get(r1)
                boolean r1 = r3.marking
                if (r1 == 0) goto L1d
                int r1 = r3.curIndex
                int r1 = r1 + 1
                r3.curIndex = r1
                goto L39
            L1d:
                java.util.List<T> r1 = r3.markIterator
                r2 = 0
                r1.remove(r2)
                goto L39
            L24:
                java.util.Iterator<T> r0 = r3.baseIterator
                java.lang.Object r0 = r0.next()
                boolean r1 = r3.marking
                if (r1 == 0) goto L39
                java.util.List<T> r1 = r3.markIterator
                r1.add(r0)
                int r1 = r3.curIndex
                int r1 = r1 + 1
                r3.curIndex = r1
            L39:
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r0 = this;
                return
        }

        public final void reset() {
                r1 = this;
                r0 = 0
                r1.curIndex = r0
                r1.marking = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class Context extends org.bson.AbstractBsonReader.Context {
        private org.bson.BsonDocumentReader.BsonDocumentMarkableIterator<org.bson.BsonValue> arrayIterator;
        private org.bson.BsonDocumentReader.BsonDocumentMarkableIterator<java.util.Map.Entry<java.lang.String, org.bson.BsonValue>> documentIterator;

        public Context(org.bson.BsonDocumentReader r1, org.bson.BsonDocumentReader.Context r2, org.bson.BsonContextType r3, org.bson.BsonArray r4) {
                r0 = this;
                r0.<init>(r2, r3)
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator r1 = new org.bson.BsonDocumentReader$BsonDocumentMarkableIterator
                java.util.Iterator r2 = r4.iterator()
                r1.<init>(r2)
                r0.arrayIterator = r1
                return
        }

        public Context(org.bson.BsonDocumentReader r1, org.bson.BsonDocumentReader.Context r2, org.bson.BsonContextType r3, org.bson.BsonDocument r4) {
                r0 = this;
                r0.<init>(r2, r3)
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator r1 = new org.bson.BsonDocumentReader$BsonDocumentMarkableIterator
                java.util.Set r2 = r4.entrySet()
                java.util.Iterator r2 = r2.iterator()
                r1.<init>(r2)
                r0.documentIterator = r1
                return
        }

        public java.util.Map.Entry<java.lang.String, org.bson.BsonValue> getNextElement() {
                r1 = this;
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<java.util.Map$Entry<java.lang.String, org.bson.BsonValue>> r0 = r1.documentIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L11
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<java.util.Map$Entry<java.lang.String, org.bson.BsonValue>> r0 = r1.documentIterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
            L11:
                r0 = 0
                return r0
        }

        public org.bson.BsonValue getNextValue() {
                r1 = this;
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<org.bson.BsonValue> r0 = r1.arrayIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L11
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<org.bson.BsonValue> r0 = r1.arrayIterator
                java.lang.Object r0 = r0.next()
                org.bson.BsonValue r0 = (org.bson.BsonValue) r0
                return r0
            L11:
                r0 = 0
                return r0
        }

        public final void mark() {
                r1 = this;
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<java.util.Map$Entry<java.lang.String, org.bson.BsonValue>> r0 = r1.documentIterator
                if (r0 == 0) goto L8
                r0.mark()
                goto Ld
            L8:
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<org.bson.BsonValue> r0 = r1.arrayIterator
                r0.mark()
            Ld:
                org.bson.AbstractBsonReader$Context r0 = r1.getParentContext()
                if (r0 == 0) goto L1c
                org.bson.AbstractBsonReader$Context r0 = r1.getParentContext()
                org.bson.BsonDocumentReader$Context r0 = (org.bson.BsonDocumentReader.Context) r0
                r0.mark()
            L1c:
                return
        }

        public final void reset() {
                r1 = this;
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<java.util.Map$Entry<java.lang.String, org.bson.BsonValue>> r0 = r1.documentIterator
                if (r0 == 0) goto L8
                r0.reset()
                goto Ld
            L8:
                org.bson.BsonDocumentReader$BsonDocumentMarkableIterator<org.bson.BsonValue> r0 = r1.arrayIterator
                r0.reset()
            Ld:
                org.bson.AbstractBsonReader$Context r0 = r1.getParentContext()
                if (r0 == 0) goto L1c
                org.bson.AbstractBsonReader$Context r0 = r1.getParentContext()
                org.bson.BsonDocumentReader$Context r0 = (org.bson.BsonDocumentReader.Context) r0
                r0.reset()
            L1c:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class Mark extends org.bson.AbstractBsonReader.Mark {
        private final org.bson.BsonDocumentReader.Context context;
        private final org.bson.BsonValue currentValue;
        public final /* synthetic */ org.bson.BsonDocumentReader this$0;

        public Mark(org.bson.BsonDocumentReader r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                org.bson.BsonValue r0 = org.bson.BsonDocumentReader.access$000(r2)
                r1.currentValue = r0
                org.bson.BsonDocumentReader$Context r2 = r2.getContext()
                r1.context = r2
                r2.mark()
                return
        }

        @Override // org.bson.AbstractBsonReader.Mark, org.bson.BsonReaderMark
        public void reset() {
                r2 = this;
                super.reset()
                org.bson.BsonDocumentReader r0 = r2.this$0
                org.bson.BsonValue r1 = r2.currentValue
                org.bson.BsonDocumentReader.access$002(r0, r1)
                org.bson.BsonDocumentReader r0 = r2.this$0
                org.bson.BsonDocumentReader$Context r1 = r2.context
                r0.setContext(r1)
                org.bson.BsonDocumentReader$Context r0 = r2.context
                r0.reset()
                return
        }
    }

    public BsonDocumentReader(org.bson.BsonDocument r4) {
            r3 = this;
            r3.<init>()
            org.bson.BsonDocumentReader$Context r0 = new org.bson.BsonDocumentReader$Context
            org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL
            r2 = 0
            r0.<init>(r3, r2, r1, r4)
            r3.setContext(r0)
            r3.currentValue = r4
            return
    }

    public static /* synthetic */ org.bson.BsonValue access$000(org.bson.BsonDocumentReader r0) {
            org.bson.BsonValue r0 = r0.currentValue
            return r0
    }

    public static /* synthetic */ org.bson.BsonValue access$002(org.bson.BsonDocumentReader r0, org.bson.BsonValue r1) {
            r0.currentValue = r1
            return r1
    }

    @Override // org.bson.AbstractBsonReader
    public final int doPeekBinarySize() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonBinary r0 = r0.asBinary()
            byte[] r0 = r0.getData()
            int r0 = r0.length
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final byte doPeekBinarySubType() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonBinary r0 = r0.asBinary()
            byte r0 = r0.getType()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonBinary doReadBinaryData() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonBinary r0 = r0.asBinary()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final boolean doReadBoolean() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonBoolean r0 = r0.asBoolean()
            boolean r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonDbPointer doReadDBPointer() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonDbPointer r0 = r0.asDBPointer()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final long doReadDateTime() {
            r2 = this;
            org.bson.BsonValue r0 = r2.currentValue
            org.bson.BsonDateTime r0 = r0.asDateTime()
            long r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public org.bson.types.Decimal128 doReadDecimal128() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonDecimal128 r0 = r0.asDecimal128()
            org.bson.types.Decimal128 r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final double doReadDouble() {
            r2 = this;
            org.bson.BsonValue r0 = r2.currentValue
            org.bson.BsonDouble r0 = r0.asDouble()
            double r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadEndArray() {
            r1 = this;
            org.bson.BsonDocumentReader$Context r0 = r1.getContext()
            org.bson.AbstractBsonReader$Context r0 = r0.getParentContext()
            r1.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadEndDocument() {
            r2 = this;
            org.bson.BsonDocumentReader$Context r0 = r2.getContext()
            org.bson.AbstractBsonReader$Context r0 = r0.getParentContext()
            r2.setContext(r0)
            int[] r0 = org.bson.BsonDocumentReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.BsonDocumentReader$Context r1 = r2.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L32
            r1 = 3
            if (r0 != r1) goto L2a
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.DONE
            r2.setState(r0)
            goto L37
        L2a:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "Unexpected ContextType."
            r0.<init>(r1)
            throw r0
        L32:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r2.setState(r0)
        L37:
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final int doReadInt32() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonInt32 r0 = r0.asInt32()
            int r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final long doReadInt64() {
            r2 = this;
            org.bson.BsonValue r0 = r2.currentValue
            org.bson.BsonInt64 r0 = r0.asInt64()
            long r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadJavaScript() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonJavaScript r0 = r0.asJavaScript()
            java.lang.String r0 = r0.getCode()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadJavaScriptWithScope() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonJavaScriptWithScope r0 = r0.asJavaScriptWithScope()
            java.lang.String r0 = r0.getCode()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadMaxKey() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadMinKey() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadNull() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.types.ObjectId doReadObjectId() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonObjectId r0 = r0.asObjectId()
            org.bson.types.ObjectId r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonRegularExpression doReadRegularExpression() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonRegularExpression r0 = r0.asRegularExpression()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadStartArray() {
            r4 = this;
            org.bson.BsonValue r0 = r4.currentValue
            org.bson.BsonArray r0 = r0.asArray()
            org.bson.BsonDocumentReader$Context r1 = new org.bson.BsonDocumentReader$Context
            org.bson.BsonDocumentReader$Context r2 = r4.getContext()
            org.bson.BsonContextType r3 = org.bson.BsonContextType.ARRAY
            r1.<init>(r4, r2, r3, r0)
            r4.setContext(r1)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadStartDocument() {
            r4 = this;
            org.bson.BsonValue r0 = r4.currentValue
            org.bson.BsonType r0 = r0.getBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            if (r0 != r1) goto L15
            org.bson.BsonValue r0 = r4.currentValue
            org.bson.BsonJavaScriptWithScope r0 = r0.asJavaScriptWithScope()
            org.bson.BsonDocument r0 = r0.getScope()
            goto L1b
        L15:
            org.bson.BsonValue r0 = r4.currentValue
            org.bson.BsonDocument r0 = r0.asDocument()
        L1b:
            org.bson.BsonDocumentReader$Context r1 = new org.bson.BsonDocumentReader$Context
            org.bson.BsonDocumentReader$Context r2 = r4.getContext()
            org.bson.BsonContextType r3 = org.bson.BsonContextType.DOCUMENT
            r1.<init>(r4, r2, r3, r0)
            r4.setContext(r1)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadString() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonString r0 = r0.asString()
            java.lang.String r0 = r0.getValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadSymbol() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonSymbol r0 = r0.asSymbol()
            java.lang.String r0 = r0.getSymbol()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonTimestamp doReadTimestamp() {
            r1 = this;
            org.bson.BsonValue r0 = r1.currentValue
            org.bson.BsonTimestamp r0 = r0.asTimestamp()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadUndefined() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doSkipName() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doSkipValue() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final /* bridge */ /* synthetic */ org.bson.AbstractBsonReader.Context getContext() {
            r1 = this;
            org.bson.BsonDocumentReader$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonDocumentReader.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonReader$Context r0 = super.getContext()
            org.bson.BsonDocumentReader$Context r0 = (org.bson.BsonDocumentReader.Context) r0
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonReaderMark getMark() {
            r1 = this;
            org.bson.BsonDocumentReader$Mark r0 = new org.bson.BsonDocumentReader$Mark
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.BsonReader
    @java.lang.Deprecated
    public void mark() {
            r2 = this;
            org.bson.BsonDocumentReader$Mark r0 = r2.mark
            if (r0 != 0) goto Lc
            org.bson.BsonDocumentReader$Mark r0 = new org.bson.BsonDocumentReader$Mark
            r0.<init>(r2)
            r2.mark = r0
            return
        Lc:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "A mark already exists; it needs to be reset before creating a new one"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader
    public org.bson.BsonType readBsonType() {
            r3 = this;
            org.bson.AbstractBsonReader$State r0 = r3.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.INITIAL
            if (r0 == r1) goto L94
            org.bson.AbstractBsonReader$State r0 = r3.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            if (r0 != r1) goto L12
            goto L94
        L12:
            org.bson.AbstractBsonReader$State r0 = r3.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            r2 = 1
            if (r0 != r1) goto L88
            int[] r0 = org.bson.BsonDocumentReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.BsonDocumentReader$Context r1 = r3.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r2) goto L61
            r1 = 2
            if (r0 != r1) goto L59
            org.bson.BsonDocumentReader$Context r0 = r3.getContext()
            java.util.Map$Entry r0 = r0.getNextElement()
            if (r0 != 0) goto L42
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_DOCUMENT
            r3.setState(r0)
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            return r0
        L42:
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.setCurrentName(r1)
            java.lang.Object r0 = r0.getValue()
            org.bson.BsonValue r0 = (org.bson.BsonValue) r0
            r3.currentValue = r0
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.NAME
            r3.setState(r0)
            goto L7a
        L59:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "Invalid ContextType."
            r0.<init>(r1)
            throw r0
        L61:
            org.bson.BsonDocumentReader$Context r0 = r3.getContext()
            org.bson.BsonValue r0 = r0.getNextValue()
            r3.currentValue = r0
            if (r0 != 0) goto L75
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_ARRAY
            r3.setState(r0)
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            return r0
        L75:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r3.setState(r0)
        L7a:
            org.bson.BsonValue r0 = r3.currentValue
            org.bson.BsonType r0 = r0.getBsonType()
            r3.setCurrentBsonType(r0)
            org.bson.BsonType r0 = r3.getCurrentBsonType()
            return r0
        L88:
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r2]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "ReadBSONType"
            r3.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
        L94:
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            r3.setCurrentBsonType(r0)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r3.setState(r0)
            org.bson.BsonType r0 = r3.getCurrentBsonType()
            return r0
    }

    @Override // org.bson.BsonReader
    @java.lang.Deprecated
    public void reset() {
            r2 = this;
            org.bson.BsonDocumentReader$Mark r0 = r2.mark
            if (r0 == 0) goto Lb
            r0.reset()
            r0 = 0
            r2.mark = r0
            return
        Lb:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "trying to reset a mark before creating it"
            r0.<init>(r1)
            throw r0
    }
}
