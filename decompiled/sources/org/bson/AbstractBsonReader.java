package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBsonReader implements org.bson.BsonReader {
    private boolean closed;
    private org.bson.AbstractBsonReader.Context context;
    private org.bson.BsonType currentBsonType;
    private java.lang.String currentName;
    private org.bson.AbstractBsonReader.State state;

    /* JADX INFO: renamed from: org.bson.AbstractBsonReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonContextType = null;

        static {
                org.bson.BsonContextType[] r0 = org.bson.BsonContextType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.AbstractBsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType = r0
                org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.AbstractBsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.AbstractBsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.AbstractBsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public abstract class Context {
        private final org.bson.BsonContextType contextType;
        private final org.bson.AbstractBsonReader.Context parentContext;

        public Context(org.bson.AbstractBsonReader.Context r1, org.bson.BsonContextType r2) {
                r0 = this;
                r0.<init>()
                r0.parentContext = r1
                r0.contextType = r2
                return
        }

        public static /* synthetic */ org.bson.AbstractBsonReader.Context access$200(org.bson.AbstractBsonReader.Context r0) {
                org.bson.AbstractBsonReader$Context r0 = r0.parentContext
                return r0
        }

        public static /* synthetic */ org.bson.BsonContextType access$300(org.bson.AbstractBsonReader.Context r0) {
                org.bson.BsonContextType r0 = r0.contextType
                return r0
        }

        public org.bson.BsonContextType getContextType() {
                r1 = this;
                org.bson.BsonContextType r0 = r1.contextType
                return r0
        }

        public final org.bson.AbstractBsonReader.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonReader$Context r0 = r1.parentContext
                return r0
        }
    }

    public class Mark implements org.bson.BsonReaderMark {
        private final org.bson.BsonContextType contextType;
        private final org.bson.BsonType currentBsonType;
        private final java.lang.String currentName;
        private final org.bson.AbstractBsonReader.Context parentContext;
        private final org.bson.AbstractBsonReader.State state;
        public final /* synthetic */ org.bson.AbstractBsonReader this$0;

        public Mark(org.bson.AbstractBsonReader r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.access$000(r2)
                r1.state = r0
                org.bson.AbstractBsonReader$Context r0 = org.bson.AbstractBsonReader.access$100(r2)
                org.bson.AbstractBsonReader$Context r0 = org.bson.AbstractBsonReader.Context.access$200(r0)
                r1.parentContext = r0
                org.bson.AbstractBsonReader$Context r0 = org.bson.AbstractBsonReader.access$100(r2)
                org.bson.BsonContextType r0 = org.bson.AbstractBsonReader.Context.access$300(r0)
                r1.contextType = r0
                org.bson.BsonType r0 = org.bson.AbstractBsonReader.access$400(r2)
                r1.currentBsonType = r0
                java.lang.String r2 = org.bson.AbstractBsonReader.access$500(r2)
                r1.currentName = r2
                return
        }

        public final org.bson.BsonContextType getContextType() {
                r1 = this;
                org.bson.BsonContextType r0 = r1.contextType
                return r0
        }

        public final org.bson.AbstractBsonReader.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonReader$Context r0 = r1.parentContext
                return r0
        }

        @Override // org.bson.BsonReaderMark
        public void reset() {
                r2 = this;
                org.bson.AbstractBsonReader r0 = r2.this$0
                org.bson.AbstractBsonReader$State r1 = r2.state
                org.bson.AbstractBsonReader.access$002(r0, r1)
                org.bson.AbstractBsonReader r0 = r2.this$0
                org.bson.BsonType r1 = r2.currentBsonType
                org.bson.AbstractBsonReader.access$402(r0, r1)
                org.bson.AbstractBsonReader r0 = r2.this$0
                java.lang.String r1 = r2.currentName
                org.bson.AbstractBsonReader.access$502(r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum State extends java.lang.Enum<org.bson.AbstractBsonReader.State> {
        private static final /* synthetic */ org.bson.AbstractBsonReader.State[] $VALUES = null;
        public static final org.bson.AbstractBsonReader.State CLOSED = null;
        public static final org.bson.AbstractBsonReader.State DONE = null;
        public static final org.bson.AbstractBsonReader.State END_OF_ARRAY = null;
        public static final org.bson.AbstractBsonReader.State END_OF_DOCUMENT = null;
        public static final org.bson.AbstractBsonReader.State INITIAL = null;
        public static final org.bson.AbstractBsonReader.State NAME = null;
        public static final org.bson.AbstractBsonReader.State SCOPE_DOCUMENT = null;
        public static final org.bson.AbstractBsonReader.State TYPE = null;
        public static final org.bson.AbstractBsonReader.State VALUE = null;

        static {
                org.bson.AbstractBsonReader$State r0 = new org.bson.AbstractBsonReader$State
                java.lang.String r1 = "INITIAL"
                r2 = 0
                r0.<init>(r1, r2)
                org.bson.AbstractBsonReader.State.INITIAL = r0
                org.bson.AbstractBsonReader$State r1 = new org.bson.AbstractBsonReader$State
                java.lang.String r3 = "TYPE"
                r4 = 1
                r1.<init>(r3, r4)
                org.bson.AbstractBsonReader.State.TYPE = r1
                org.bson.AbstractBsonReader$State r3 = new org.bson.AbstractBsonReader$State
                java.lang.String r5 = "NAME"
                r6 = 2
                r3.<init>(r5, r6)
                org.bson.AbstractBsonReader.State.NAME = r3
                org.bson.AbstractBsonReader$State r5 = new org.bson.AbstractBsonReader$State
                java.lang.String r7 = "VALUE"
                r8 = 3
                r5.<init>(r7, r8)
                org.bson.AbstractBsonReader.State.VALUE = r5
                org.bson.AbstractBsonReader$State r7 = new org.bson.AbstractBsonReader$State
                java.lang.String r9 = "SCOPE_DOCUMENT"
                r10 = 4
                r7.<init>(r9, r10)
                org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT = r7
                org.bson.AbstractBsonReader$State r9 = new org.bson.AbstractBsonReader$State
                java.lang.String r11 = "END_OF_DOCUMENT"
                r12 = 5
                r9.<init>(r11, r12)
                org.bson.AbstractBsonReader.State.END_OF_DOCUMENT = r9
                org.bson.AbstractBsonReader$State r11 = new org.bson.AbstractBsonReader$State
                java.lang.String r13 = "END_OF_ARRAY"
                r14 = 6
                r11.<init>(r13, r14)
                org.bson.AbstractBsonReader.State.END_OF_ARRAY = r11
                org.bson.AbstractBsonReader$State r13 = new org.bson.AbstractBsonReader$State
                java.lang.String r15 = "DONE"
                r14 = 7
                r13.<init>(r15, r14)
                org.bson.AbstractBsonReader.State.DONE = r13
                org.bson.AbstractBsonReader$State r15 = new org.bson.AbstractBsonReader$State
                java.lang.String r14 = "CLOSED"
                r12 = 8
                r15.<init>(r14, r12)
                org.bson.AbstractBsonReader.State.CLOSED = r15
                r14 = 9
                org.bson.AbstractBsonReader$State[] r14 = new org.bson.AbstractBsonReader.State[r14]
                r14[r2] = r0
                r14[r4] = r1
                r14[r6] = r3
                r14[r8] = r5
                r14[r10] = r7
                r0 = 5
                r14[r0] = r9
                r0 = 6
                r14[r0] = r11
                r0 = 7
                r14[r0] = r13
                r14[r12] = r15
                org.bson.AbstractBsonReader.State.$VALUES = r14
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.bson.AbstractBsonReader.State valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.AbstractBsonReader$State> r0 = org.bson.AbstractBsonReader.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.AbstractBsonReader$State r1 = (org.bson.AbstractBsonReader.State) r1
                return r1
        }

        public static org.bson.AbstractBsonReader.State[] values() {
                org.bson.AbstractBsonReader$State[] r0 = org.bson.AbstractBsonReader.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.AbstractBsonReader$State[] r0 = (org.bson.AbstractBsonReader.State[]) r0
                return r0
        }
    }

    public AbstractBsonReader() {
            r1 = this;
            r1.<init>()
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.INITIAL
            r1.state = r0
            return
    }

    public static /* synthetic */ org.bson.AbstractBsonReader.State access$000(org.bson.AbstractBsonReader r0) {
            org.bson.AbstractBsonReader$State r0 = r0.state
            return r0
    }

    public static /* synthetic */ org.bson.AbstractBsonReader.State access$002(org.bson.AbstractBsonReader r0, org.bson.AbstractBsonReader.State r1) {
            r0.state = r1
            return r1
    }

    public static /* synthetic */ org.bson.AbstractBsonReader.Context access$100(org.bson.AbstractBsonReader r0) {
            org.bson.AbstractBsonReader$Context r0 = r0.context
            return r0
    }

    public static /* synthetic */ org.bson.BsonType access$400(org.bson.AbstractBsonReader r0) {
            org.bson.BsonType r0 = r0.currentBsonType
            return r0
    }

    public static /* synthetic */ org.bson.BsonType access$402(org.bson.AbstractBsonReader r0, org.bson.BsonType r1) {
            r0.currentBsonType = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$500(org.bson.AbstractBsonReader r0) {
            java.lang.String r0 = r0.currentName
            return r0
    }

    public static /* synthetic */ java.lang.String access$502(org.bson.AbstractBsonReader r0, java.lang.String r1) {
            r0.currentName = r1
            return r1
    }

    private void setStateOnEnd() {
            r4 = this;
            int[] r0 = org.bson.AbstractBsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.AbstractBsonReader$Context r1 = r4.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L37
            r2 = 2
            if (r0 == r2) goto L37
            r2 = 4
            if (r0 != r2) goto L1e
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.DONE
            r4.state = r0
            goto L3b
        L1e:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            org.bson.AbstractBsonReader$Context r3 = r4.getContext()
            org.bson.BsonContextType r3 = r3.getContextType()
            r1[r2] = r3
            java.lang.String r2 = "Unexpected ContextType %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L37:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r4.state = r0
        L3b:
            return
    }

    public final void checkPreconditions(java.lang.String r5, org.bson.BsonType r6) {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L4c
            org.bson.AbstractBsonReader$State r0 = r4.state
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.INITIAL
            if (r0 == r1) goto L12
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            if (r0 == r1) goto L12
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            if (r0 != r1) goto L15
        L12:
            r4.readBsonType()
        L15:
            org.bson.AbstractBsonReader$State r0 = r4.state
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.NAME
            if (r0 != r1) goto L1e
            r4.skipName()
        L1e:
            org.bson.AbstractBsonReader$State r0 = r4.state
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.VALUE
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L43
            org.bson.BsonType r0 = r4.currentBsonType
            if (r0 != r6) goto L2b
            return
        L2b:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r1[r3] = r6
            r5 = 2
            org.bson.BsonType r6 = r4.currentBsonType
            r1[r5] = r6
            java.lang.String r5 = "%s can only be called when CurrentBSONType is %s, not when CurrentBSONType is %s."
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5)
            throw r0
        L43:
            org.bson.AbstractBsonReader$State[] r6 = new org.bson.AbstractBsonReader.State[r3]
            r6[r2] = r1
            r4.throwInvalidState(r5, r6)
            r5 = 0
            throw r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "BsonWriter is closed"
            r5.<init>(r6)
            throw r5
    }

    @Override // org.bson.BsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.closed = r0
            return
    }

    public abstract int doPeekBinarySize();

    public abstract byte doPeekBinarySubType();

    public abstract org.bson.BsonBinary doReadBinaryData();

    public abstract boolean doReadBoolean();

    public abstract org.bson.BsonDbPointer doReadDBPointer();

    public abstract long doReadDateTime();

    public abstract org.bson.types.Decimal128 doReadDecimal128();

    public abstract double doReadDouble();

    public abstract void doReadEndArray();

    public abstract void doReadEndDocument();

    public abstract int doReadInt32();

    public abstract long doReadInt64();

    public abstract java.lang.String doReadJavaScript();

    public abstract java.lang.String doReadJavaScriptWithScope();

    public abstract void doReadMaxKey();

    public abstract void doReadMinKey();

    public abstract void doReadNull();

    public abstract org.bson.types.ObjectId doReadObjectId();

    public abstract org.bson.BsonRegularExpression doReadRegularExpression();

    public abstract void doReadStartArray();

    public abstract void doReadStartDocument();

    public abstract java.lang.String doReadString();

    public abstract java.lang.String doReadSymbol();

    public abstract org.bson.BsonTimestamp doReadTimestamp();

    public abstract void doReadUndefined();

    public abstract void doSkipName();

    public abstract void doSkipValue();

    public org.bson.AbstractBsonReader.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonReader$Context r0 = r1.context
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonType getCurrentBsonType() {
            r1 = this;
            org.bson.BsonType r0 = r1.currentBsonType
            return r0
    }

    @Override // org.bson.BsonReader
    public java.lang.String getCurrentName() {
            r3 = this;
            org.bson.AbstractBsonReader$State r0 = r3.state
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.VALUE
            if (r0 != r1) goto L9
            java.lang.String r0 = r3.currentName
            return r0
        L9:
            r0 = 1
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "getCurrentName"
            r3.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
    }

    public final org.bson.AbstractBsonReader.State getNextState() {
            r4 = this;
            int[] r0 = org.bson.AbstractBsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.AbstractBsonReader$Context r1 = r4.context
            org.bson.BsonContextType r1 = r1.getContextType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r2 = 2
            if (r0 == r2) goto L34
            r2 = 3
            if (r0 == r2) goto L34
            r2 = 4
            if (r0 != r2) goto L1d
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.DONE
            return r0
        L1d:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            org.bson.AbstractBsonReader$Context r3 = r4.context
            org.bson.BsonContextType r3 = r3.getContextType()
            r1[r2] = r3
            java.lang.String r2 = "Unexpected ContextType %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L34:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            return r0
    }

    public org.bson.AbstractBsonReader.State getState() {
            r1 = this;
            org.bson.AbstractBsonReader$State r0 = r1.state
            return r0
    }

    public final boolean isClosed() {
            r1 = this;
            boolean r0 = r1.closed
            return r0
    }

    @Override // org.bson.BsonReader
    public int peekBinarySize() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            java.lang.String r1 = "readBinaryData"
            r2.checkPreconditions(r1, r0)
            int r0 = r2.doPeekBinarySize()
            return r0
    }

    @Override // org.bson.BsonReader
    public byte peekBinarySubType() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            java.lang.String r1 = "readBinaryData"
            r2.checkPreconditions(r1, r0)
            byte r0 = r2.doPeekBinarySubType()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonBinary readBinaryData() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            java.lang.String r1 = "readBinaryData"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            org.bson.BsonBinary r0 = r2.doReadBinaryData()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonBinary readBinaryData(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            org.bson.BsonBinary r1 = r0.readBinaryData()
            return r1
    }

    @Override // org.bson.BsonReader
    public boolean readBoolean() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BOOLEAN
            java.lang.String r1 = "readBoolean"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            boolean r0 = r2.doReadBoolean()
            return r0
    }

    @Override // org.bson.BsonReader
    public boolean readBoolean(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            boolean r1 = r0.readBoolean()
            return r1
    }

    @Override // org.bson.BsonReader
    public abstract org.bson.BsonType readBsonType();

    @Override // org.bson.BsonReader
    public org.bson.BsonDbPointer readDBPointer() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            java.lang.String r1 = "readDBPointer"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            org.bson.BsonDbPointer r0 = r2.doReadDBPointer()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonDbPointer readDBPointer(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            org.bson.BsonDbPointer r1 = r0.readDBPointer()
            return r1
    }

    @Override // org.bson.BsonReader
    public long readDateTime() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            java.lang.String r1 = "readDateTime"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            long r0 = r2.doReadDateTime()
            return r0
    }

    @Override // org.bson.BsonReader
    public long readDateTime(java.lang.String r3) {
            r2 = this;
            r2.verifyName(r3)
            long r0 = r2.readDateTime()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.types.Decimal128 readDecimal128() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            java.lang.String r1 = "readDecimal"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            org.bson.types.Decimal128 r0 = r2.doReadDecimal128()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.types.Decimal128 readDecimal128(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            org.bson.types.Decimal128 r1 = r0.readDecimal128()
            return r1
    }

    @Override // org.bson.BsonReader
    public double readDouble() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            java.lang.String r1 = "readDouble"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            double r0 = r2.doReadDouble()
            return r0
    }

    @Override // org.bson.BsonReader
    public double readDouble(java.lang.String r3) {
            r2 = this;
            r2.verifyName(r3)
            double r0 = r2.readDouble()
            return r0
    }

    @Override // org.bson.BsonReader
    public void readEndArray() {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L49
            org.bson.AbstractBsonReader$Context r0 = r5.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L37
            org.bson.AbstractBsonReader$State r0 = r5.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            if (r0 != r1) goto L1e
            r5.readBsonType()
        L1e:
            org.bson.AbstractBsonReader$State r0 = r5.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.END_OF_ARRAY
            if (r0 != r1) goto L2d
            r5.doReadEndArray()
            r5.setStateOnEnd()
            return
        L2d:
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r4]
            r0[r3] = r1
            java.lang.String r1 = "ReadEndArray"
            r5.throwInvalidState(r1, r0)
            throw r2
        L37:
            org.bson.AbstractBsonReader$Context r0 = r5.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType[] r4 = new org.bson.BsonContextType[r4]
            r4[r3] = r1
            java.lang.String r1 = "readEndArray"
            r5.throwInvalidContextType(r1, r0, r4)
            throw r2
        L49:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BSONBinaryWriter"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonReader
    public void readEndDocument() {
            r8 = this;
            boolean r0 = r8.closed
            if (r0 != 0) goto L57
            org.bson.AbstractBsonReader$Context r0 = r8.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "readEndDocument"
            if (r0 == r1) goto L35
            org.bson.AbstractBsonReader$Context r0 = r8.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r6 = org.bson.BsonContextType.SCOPE_DOCUMENT
            if (r0 != r6) goto L22
            goto L35
        L22:
            org.bson.AbstractBsonReader$Context r0 = r8.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            r7 = 2
            org.bson.BsonContextType[] r7 = new org.bson.BsonContextType[r7]
            r7[r4] = r1
            r7[r3] = r6
            r8.throwInvalidContextType(r5, r0, r7)
            throw r2
        L35:
            org.bson.AbstractBsonReader$State r0 = r8.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            if (r0 != r1) goto L40
            r8.readBsonType()
        L40:
            org.bson.AbstractBsonReader$State r0 = r8.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.END_OF_DOCUMENT
            if (r0 != r1) goto L4f
            r8.doReadEndDocument()
            r8.setStateOnEnd()
            return
        L4f:
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r3]
            r0[r4] = r1
            r8.throwInvalidState(r5, r0)
            throw r2
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BSONBinaryWriter"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonReader
    public int readInt32() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            java.lang.String r1 = "readInt32"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            int r0 = r2.doReadInt32()
            return r0
    }

    @Override // org.bson.BsonReader
    public int readInt32(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            int r1 = r0.readInt32()
            return r1
    }

    @Override // org.bson.BsonReader
    public long readInt64() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            java.lang.String r1 = "readInt64"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            long r0 = r2.doReadInt64()
            return r0
    }

    @Override // org.bson.BsonReader
    public long readInt64(java.lang.String r3) {
            r2 = this;
            r2.verifyName(r3)
            long r0 = r2.readInt64()
            return r0
    }

    @Override // org.bson.BsonReader
    public java.lang.String readJavaScript() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT
            java.lang.String r1 = "readJavaScript"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            java.lang.String r0 = r2.doReadJavaScript()
            return r0
    }

    @Override // org.bson.BsonReader
    public java.lang.String readJavaScript(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            java.lang.String r1 = r0.readJavaScript()
            return r1
    }

    @Override // org.bson.BsonReader
    public java.lang.String readJavaScriptWithScope() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            java.lang.String r1 = "readJavaScriptWithScope"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            r2.state = r0
            java.lang.String r0 = r2.doReadJavaScriptWithScope()
            return r0
    }

    @Override // org.bson.BsonReader
    public java.lang.String readJavaScriptWithScope(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            java.lang.String r1 = r0.readJavaScriptWithScope()
            return r1
    }

    @Override // org.bson.BsonReader
    public void readMaxKey() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.MAX_KEY
            java.lang.String r1 = "readMaxKey"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            r2.doReadMaxKey()
            return
    }

    @Override // org.bson.BsonReader
    public void readMaxKey(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            r0.readMaxKey()
            return
    }

    @Override // org.bson.BsonReader
    public void readMinKey() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.MIN_KEY
            java.lang.String r1 = "readMinKey"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            r2.doReadMinKey()
            return
    }

    @Override // org.bson.BsonReader
    public void readMinKey(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            r0.readMinKey()
            return
    }

    @Override // org.bson.BsonReader
    public java.lang.String readName() {
            r3 = this;
            org.bson.AbstractBsonReader$State r0 = r3.state
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            if (r0 != r1) goto L9
            r3.readBsonType()
        L9:
            org.bson.AbstractBsonReader$State r0 = r3.state
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.NAME
            if (r0 != r1) goto L16
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r3.state = r0
            java.lang.String r0 = r3.currentName
            return r0
        L16:
            r0 = 1
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "readName"
            r3.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
    }

    @Override // org.bson.BsonReader
    public void readName(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            return
    }

    @Override // org.bson.BsonReader
    public void readNull() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.NULL
            java.lang.String r1 = "readNull"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            r2.doReadNull()
            return
    }

    @Override // org.bson.BsonReader
    public void readNull(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            r0.readNull()
            return
    }

    @Override // org.bson.BsonReader
    public org.bson.types.ObjectId readObjectId() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            java.lang.String r1 = "readObjectId"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            org.bson.types.ObjectId r0 = r2.doReadObjectId()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.types.ObjectId readObjectId(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            org.bson.types.ObjectId r1 = r0.readObjectId()
            return r1
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonRegularExpression readRegularExpression() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            java.lang.String r1 = "readRegularExpression"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            org.bson.BsonRegularExpression r0 = r2.doReadRegularExpression()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonRegularExpression readRegularExpression(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            org.bson.BsonRegularExpression r1 = r0.readRegularExpression()
            return r1
    }

    @Override // org.bson.BsonReader
    public void readStartArray() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.ARRAY
            java.lang.String r1 = "readStartArray"
            r2.checkPreconditions(r1, r0)
            r2.doReadStartArray()
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r2.state = r0
            return
    }

    @Override // org.bson.BsonReader
    public void readStartDocument() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            java.lang.String r1 = "readStartDocument"
            r2.checkPreconditions(r1, r0)
            r2.doReadStartDocument()
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r2.state = r0
            return
    }

    @Override // org.bson.BsonReader
    public java.lang.String readString() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.STRING
            java.lang.String r1 = "readString"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            java.lang.String r0 = r2.doReadString()
            return r0
    }

    @Override // org.bson.BsonReader
    public java.lang.String readString(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            java.lang.String r1 = r0.readString()
            return r1
    }

    @Override // org.bson.BsonReader
    public java.lang.String readSymbol() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.SYMBOL
            java.lang.String r1 = "readSymbol"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            java.lang.String r0 = r2.doReadSymbol()
            return r0
    }

    @Override // org.bson.BsonReader
    public java.lang.String readSymbol(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            java.lang.String r1 = r0.readSymbol()
            return r1
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonTimestamp readTimestamp() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.TIMESTAMP
            java.lang.String r1 = "readTimestamp"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            org.bson.BsonTimestamp r0 = r2.doReadTimestamp()
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonTimestamp readTimestamp(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            org.bson.BsonTimestamp r1 = r0.readTimestamp()
            return r1
    }

    @Override // org.bson.BsonReader
    public void readUndefined() {
            r2 = this;
            org.bson.BsonType r0 = org.bson.BsonType.UNDEFINED
            java.lang.String r1 = "readUndefined"
            r2.checkPreconditions(r1, r0)
            org.bson.AbstractBsonReader$State r0 = r2.getNextState()
            r2.state = r0
            r2.doReadUndefined()
            return
    }

    @Override // org.bson.BsonReader
    public void readUndefined(java.lang.String r1) {
            r0 = this;
            r0.verifyName(r1)
            r0.readUndefined()
            return
    }

    public final void setContext(org.bson.AbstractBsonReader.Context r1) {
            r0 = this;
            r0.context = r1
            return
    }

    public final void setCurrentBsonType(org.bson.BsonType r1) {
            r0 = this;
            r0.currentBsonType = r1
            return
    }

    public final void setCurrentName(java.lang.String r1) {
            r0 = this;
            r0.currentName = r1
            return
    }

    public final void setState(org.bson.AbstractBsonReader.State r1) {
            r0 = this;
            r0.state = r1
            return
    }

    @Override // org.bson.BsonReader
    public void skipName() {
            r3 = this;
            boolean r0 = r3.closed
            if (r0 != 0) goto L22
            org.bson.AbstractBsonReader$State r0 = r3.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.NAME
            if (r0 != r1) goto L14
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r3.state = r0
            r3.doSkipName()
            return
        L14:
            r0 = 1
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "skipName"
            r3.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This instance has been closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonReader
    public void skipValue() {
            r3 = this;
            boolean r0 = r3.closed
            if (r0 != 0) goto L22
            org.bson.AbstractBsonReader$State r0 = r3.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.VALUE
            if (r0 != r1) goto L14
            r3.doSkipValue()
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r3.state = r0
            return
        L14:
            r0 = 1
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "skipValue"
            r3.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BSONBinaryWriter"
            r0.<init>(r1)
            throw r0
    }

    public final void throwInvalidContextType(java.lang.String r3, org.bson.BsonContextType r4, org.bson.BsonContextType... r5) {
            r2 = this;
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.lang.String r0 = " or "
            java.lang.String r5 = org.bson.StringUtils.join(r0, r5)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r5
            r3 = 2
            r0[r3] = r4
            java.lang.String r3 = "%s can only be called when ContextType is %s, not when ContextType is %s."
            java.lang.String r3 = java.lang.String.format(r3, r0)
            org.bson.BsonInvalidOperationException r4 = new org.bson.BsonInvalidOperationException
            r4.<init>(r3)
            throw r4
    }

    public final void throwInvalidState(java.lang.String r3, org.bson.AbstractBsonReader.State... r4) {
            r2 = this;
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.String r0 = " or "
            java.lang.String r4 = org.bson.StringUtils.join(r0, r4)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            org.bson.AbstractBsonReader$State r3 = r2.state
            r4 = 2
            r0[r4] = r3
            java.lang.String r3 = "%s can only be called when State is %s, not when State is %s."
            java.lang.String r3 = java.lang.String.format(r3, r0)
            org.bson.BsonInvalidOperationException r4 = new org.bson.BsonInvalidOperationException
            r4.<init>(r3)
            throw r4
    }

    public final void verifyName(java.lang.String r5) {
            r4 = this;
            r4.readBsonType()
            java.lang.String r0 = r4.readName()
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto Le
            return
        Le:
            org.bson.BsonSerializationException r1 = new org.bson.BsonSerializationException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            java.lang.String r5 = "Expected element name to be '%s', not '%s'."
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5)
            throw r1
    }
}
