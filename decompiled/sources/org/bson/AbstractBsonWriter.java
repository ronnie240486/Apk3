package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBsonWriter implements org.bson.BsonWriter, java.io.Closeable {
    private boolean closed;
    private org.bson.AbstractBsonWriter.Context context;
    private final java.util.Stack<org.bson.FieldNameValidator> fieldNameValidatorStack;
    private int serializationDepth;
    private final org.bson.BsonWriterSettings settings;
    private org.bson.AbstractBsonWriter.State state;

    /* JADX INFO: renamed from: org.bson.AbstractBsonWriter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r1 = org.bson.BsonType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r1 = org.bson.BsonType.STRING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L3e
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L49
                org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L54
                org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L60
                org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L6c
                org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L78
                org.bson.BsonType r1 = org.bson.BsonType.NULL     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L84
                org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L90
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L9c
                org.bson.BsonType r1 = org.bson.BsonType.SYMBOL     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> La8
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lb4
                org.bson.BsonType r1 = org.bson.BsonType.INT32     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lc0
                org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lcc
                org.bson.BsonType r1 = org.bson.BsonType.INT64     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Ld8
                org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Le4
                org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lf0
                org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lfc
                org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class Context {
        private final org.bson.BsonContextType contextType;
        private java.lang.String name;
        private final org.bson.AbstractBsonWriter.Context parentContext;
        public final /* synthetic */ org.bson.AbstractBsonWriter this$0;

        public Context(org.bson.AbstractBsonWriter r1, org.bson.AbstractBsonWriter.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                org.bson.AbstractBsonWriter$Context r1 = r2.parentContext
                r0.parentContext = r1
                org.bson.BsonContextType r1 = r2.contextType
                r0.contextType = r1
                return
        }

        public Context(org.bson.AbstractBsonWriter r1, org.bson.AbstractBsonWriter.Context r2, org.bson.BsonContextType r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parentContext = r2
                r0.contextType = r3
                return
        }

        public static /* synthetic */ java.lang.String access$000(org.bson.AbstractBsonWriter.Context r0) {
                java.lang.String r0 = r0.name
                return r0
        }

        public static /* synthetic */ java.lang.String access$002(org.bson.AbstractBsonWriter.Context r0, java.lang.String r1) {
                r0.name = r1
                return r1
        }

        public org.bson.AbstractBsonWriter.Context copy() {
                r2 = this;
                org.bson.AbstractBsonWriter$Context r0 = new org.bson.AbstractBsonWriter$Context
                org.bson.AbstractBsonWriter r1 = r2.this$0
                r0.<init>(r1, r2)
                return r0
        }

        public org.bson.BsonContextType getContextType() {
                r1 = this;
                org.bson.BsonContextType r0 = r1.contextType
                return r0
        }

        public org.bson.AbstractBsonWriter.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonWriter$Context r0 = r1.parentContext
                return r0
        }
    }

    public class Mark {
        private final java.lang.String currentName;
        private final org.bson.AbstractBsonWriter.Context markedContext;
        private final org.bson.AbstractBsonWriter.State markedState;
        private final int serializationDepth;
        public final /* synthetic */ org.bson.AbstractBsonWriter this$0;

        public Mark(org.bson.AbstractBsonWriter r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                org.bson.AbstractBsonWriter$Context r0 = org.bson.AbstractBsonWriter.access$100(r2)
                org.bson.AbstractBsonWriter$Context r0 = r0.copy()
                r1.markedContext = r0
                org.bson.AbstractBsonWriter$State r0 = org.bson.AbstractBsonWriter.access$200(r2)
                r1.markedState = r0
                org.bson.AbstractBsonWriter$Context r0 = org.bson.AbstractBsonWriter.access$100(r2)
                java.lang.String r0 = org.bson.AbstractBsonWriter.Context.access$000(r0)
                r1.currentName = r0
                int r2 = org.bson.AbstractBsonWriter.access$300(r2)
                r1.serializationDepth = r2
                return
        }

        public void reset() {
                r2 = this;
                org.bson.AbstractBsonWriter r0 = r2.this$0
                org.bson.AbstractBsonWriter$Context r1 = r2.markedContext
                r0.setContext(r1)
                org.bson.AbstractBsonWriter r0 = r2.this$0
                org.bson.AbstractBsonWriter$State r1 = r2.markedState
                r0.setState(r1)
                org.bson.AbstractBsonWriter r0 = r2.this$0
                org.bson.AbstractBsonWriter$Context r0 = org.bson.AbstractBsonWriter.access$100(r0)
                java.lang.String r1 = r2.currentName
                org.bson.AbstractBsonWriter.Context.access$002(r0, r1)
                org.bson.AbstractBsonWriter r0 = r2.this$0
                int r1 = r2.serializationDepth
                org.bson.AbstractBsonWriter.access$302(r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum State extends java.lang.Enum<org.bson.AbstractBsonWriter.State> {
        private static final /* synthetic */ org.bson.AbstractBsonWriter.State[] $VALUES = null;
        public static final org.bson.AbstractBsonWriter.State CLOSED = null;
        public static final org.bson.AbstractBsonWriter.State DONE = null;
        public static final org.bson.AbstractBsonWriter.State INITIAL = null;
        public static final org.bson.AbstractBsonWriter.State NAME = null;
        public static final org.bson.AbstractBsonWriter.State SCOPE_DOCUMENT = null;
        public static final org.bson.AbstractBsonWriter.State VALUE = null;

        static {
                org.bson.AbstractBsonWriter$State r0 = new org.bson.AbstractBsonWriter$State
                java.lang.String r1 = "INITIAL"
                r2 = 0
                r0.<init>(r1, r2)
                org.bson.AbstractBsonWriter.State.INITIAL = r0
                org.bson.AbstractBsonWriter$State r1 = new org.bson.AbstractBsonWriter$State
                java.lang.String r3 = "NAME"
                r4 = 1
                r1.<init>(r3, r4)
                org.bson.AbstractBsonWriter.State.NAME = r1
                org.bson.AbstractBsonWriter$State r3 = new org.bson.AbstractBsonWriter$State
                java.lang.String r5 = "VALUE"
                r6 = 2
                r3.<init>(r5, r6)
                org.bson.AbstractBsonWriter.State.VALUE = r3
                org.bson.AbstractBsonWriter$State r5 = new org.bson.AbstractBsonWriter$State
                java.lang.String r7 = "SCOPE_DOCUMENT"
                r8 = 3
                r5.<init>(r7, r8)
                org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT = r5
                org.bson.AbstractBsonWriter$State r7 = new org.bson.AbstractBsonWriter$State
                java.lang.String r9 = "DONE"
                r10 = 4
                r7.<init>(r9, r10)
                org.bson.AbstractBsonWriter.State.DONE = r7
                org.bson.AbstractBsonWriter$State r9 = new org.bson.AbstractBsonWriter$State
                java.lang.String r11 = "CLOSED"
                r12 = 5
                r9.<init>(r11, r12)
                org.bson.AbstractBsonWriter.State.CLOSED = r9
                r11 = 6
                org.bson.AbstractBsonWriter$State[] r11 = new org.bson.AbstractBsonWriter.State[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                org.bson.AbstractBsonWriter.State.$VALUES = r11
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.bson.AbstractBsonWriter.State valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.AbstractBsonWriter$State> r0 = org.bson.AbstractBsonWriter.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.AbstractBsonWriter$State r1 = (org.bson.AbstractBsonWriter.State) r1
                return r1
        }

        public static org.bson.AbstractBsonWriter.State[] values() {
                org.bson.AbstractBsonWriter$State[] r0 = org.bson.AbstractBsonWriter.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.AbstractBsonWriter$State[] r0 = (org.bson.AbstractBsonWriter.State[]) r0
                return r0
        }
    }

    public AbstractBsonWriter(org.bson.BsonWriterSettings r2) {
            r1 = this;
            org.bson.NoOpFieldNameValidator r0 = new org.bson.NoOpFieldNameValidator
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public AbstractBsonWriter(org.bson.BsonWriterSettings r2, org.bson.FieldNameValidator r3) {
            r1 = this;
            r1.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.fieldNameValidatorStack = r0
            if (r3 == 0) goto L16
            r1.settings = r2
            r0.push(r3)
            org.bson.AbstractBsonWriter$State r2 = org.bson.AbstractBsonWriter.State.INITIAL
            r1.state = r2
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Validator can not be null"
            r2.<init>(r3)
            throw r2
    }

    public static /* synthetic */ org.bson.AbstractBsonWriter.Context access$100(org.bson.AbstractBsonWriter r0) {
            org.bson.AbstractBsonWriter$Context r0 = r0.context
            return r0
    }

    public static /* synthetic */ org.bson.AbstractBsonWriter.State access$200(org.bson.AbstractBsonWriter r0) {
            org.bson.AbstractBsonWriter$State r0 = r0.state
            return r0
    }

    public static /* synthetic */ int access$300(org.bson.AbstractBsonWriter r0) {
            int r0 = r0.serializationDepth
            return r0
    }

    public static /* synthetic */ int access$302(org.bson.AbstractBsonWriter r0, int r1) {
            r0.serializationDepth = r1
            return r1
    }

    private void pipeArray(org.bson.BsonArray r2) {
            r1 = this;
            r1.writeStartArray()
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            org.bson.BsonValue r0 = (org.bson.BsonValue) r0
            r1.pipeValue(r0)
            goto L7
        L17:
            r1.writeEndArray()
            return
    }

    private void pipeArray(org.bson.BsonReader r3) {
            r2 = this;
            r3.readStartArray()
            r2.writeStartArray()
        L6:
            org.bson.BsonType r0 = r3.readBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            if (r0 == r1) goto L18
            r2.pipeValue(r3)
            boolean r0 = r2.abortPipe()
            if (r0 == 0) goto L6
            return
        L18:
            r3.readEndArray()
            r2.writeEndArray()
            return
    }

    private void pipeDocument(org.bson.BsonDocument r3) {
            r2 = this;
            r2.writeStartDocument()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2.writeName(r1)
            java.lang.Object r0 = r0.getValue()
            org.bson.BsonValue r0 = (org.bson.BsonValue) r0
            r2.pipeValue(r0)
            goto Lb
        L2a:
            r2.writeEndDocument()
            return
    }

    private void pipeDocument(org.bson.BsonReader r3, java.util.List<org.bson.BsonElement> r4) {
            r2 = this;
            r3.readStartDocument()
            r2.writeStartDocument()
        L6:
            org.bson.BsonType r0 = r3.readBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            if (r0 == r1) goto L1f
            java.lang.String r0 = r3.readName()
            r2.writeName(r0)
            r2.pipeValue(r3)
            boolean r0 = r2.abortPipe()
            if (r0 == 0) goto L6
            return
        L1f:
            r3.readEndDocument()
            if (r4 == 0) goto L27
            r2.pipeExtraElements(r4)
        L27:
            r2.writeEndDocument()
            return
    }

    private void pipeJavascriptWithScope(org.bson.BsonJavaScriptWithScope r2) {
            r1 = this;
            java.lang.String r0 = r2.getCode()
            r1.writeJavaScriptWithScope(r0)
            org.bson.BsonDocument r2 = r2.getScope()
            r1.pipeDocument(r2)
            return
    }

    private void pipeJavascriptWithScope(org.bson.BsonReader r2) {
            r1 = this;
            java.lang.String r0 = r2.readJavaScriptWithScope()
            r1.writeJavaScriptWithScope(r0)
            r0 = 0
            r1.pipeDocument(r2, r0)
            return
    }

    private void pipeValue(org.bson.BsonReader r3) {
            r2 = this;
            int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType
            org.bson.BsonType r1 = r3.getCurrentBsonType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lc1;
                case 2: goto Lbd;
                case 3: goto Lb5;
                case 4: goto Lad;
                case 5: goto La5;
                case 6: goto L9e;
                case 7: goto L96;
                case 8: goto L8e;
                case 9: goto L86;
                case 10: goto L7f;
                case 11: goto L77;
                case 12: goto L6f;
                case 13: goto L67;
                case 14: goto L63;
                case 15: goto L5b;
                case 16: goto L52;
                case 17: goto L49;
                case 18: goto L40;
                case 19: goto L38;
                case 20: goto L2f;
                case 21: goto L27;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unhandled BSON type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            org.bson.BsonType r3 = r3.getCurrentBsonType()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r3.readMaxKey()
            r2.writeMaxKey()
            goto Lc5
        L2f:
            org.bson.BsonDbPointer r3 = r3.readDBPointer()
            r2.writeDBPointer(r3)
            goto Lc5
        L38:
            r3.readMinKey()
            r2.writeMinKey()
            goto Lc5
        L40:
            org.bson.types.Decimal128 r3 = r3.readDecimal128()
            r2.writeDecimal128(r3)
            goto Lc5
        L49:
            long r0 = r3.readInt64()
            r2.writeInt64(r0)
            goto Lc5
        L52:
            org.bson.BsonTimestamp r3 = r3.readTimestamp()
            r2.writeTimestamp(r3)
            goto Lc5
        L5b:
            int r3 = r3.readInt32()
            r2.writeInt32(r3)
            goto Lc5
        L63:
            r2.pipeJavascriptWithScope(r3)
            goto Lc5
        L67:
            java.lang.String r3 = r3.readSymbol()
            r2.writeSymbol(r3)
            goto Lc5
        L6f:
            java.lang.String r3 = r3.readJavaScript()
            r2.writeJavaScript(r3)
            goto Lc5
        L77:
            org.bson.BsonRegularExpression r3 = r3.readRegularExpression()
            r2.writeRegularExpression(r3)
            goto Lc5
        L7f:
            r3.readNull()
            r2.writeNull()
            goto Lc5
        L86:
            long r0 = r3.readDateTime()
            r2.writeDateTime(r0)
            goto Lc5
        L8e:
            boolean r3 = r3.readBoolean()
            r2.writeBoolean(r3)
            goto Lc5
        L96:
            org.bson.types.ObjectId r3 = r3.readObjectId()
            r2.writeObjectId(r3)
            goto Lc5
        L9e:
            r3.readUndefined()
            r2.writeUndefined()
            goto Lc5
        La5:
            org.bson.BsonBinary r3 = r3.readBinaryData()
            r2.writeBinaryData(r3)
            goto Lc5
        Lad:
            java.lang.String r3 = r3.readString()
            r2.writeString(r3)
            goto Lc5
        Lb5:
            double r0 = r3.readDouble()
            r2.writeDouble(r0)
            goto Lc5
        Lbd:
            r2.pipeArray(r3)
            goto Lc5
        Lc1:
            r0 = 0
            r2.pipeDocument(r3, r0)
        Lc5:
            return
    }

    private void pipeValue(org.bson.BsonValue r3) {
            r2 = this;
            int[] r0 = org.bson.AbstractBsonWriter.AnonymousClass1.$SwitchMap$org$bson$BsonType
            org.bson.BsonType r1 = r3.getBsonType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Le8;
                case 2: goto Le0;
                case 3: goto Ld4;
                case 4: goto Lc8;
                case 5: goto Lc0;
                case 6: goto Lbc;
                case 7: goto Lb0;
                case 8: goto La4;
                case 9: goto L98;
                case 10: goto L94;
                case 11: goto L8c;
                case 12: goto L80;
                case 13: goto L73;
                case 14: goto L6a;
                case 15: goto L5d;
                case 16: goto L54;
                case 17: goto L47;
                case 18: goto L3a;
                case 19: goto L35;
                case 20: goto L2c;
                case 21: goto L27;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unhandled BSON type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            org.bson.BsonType r3 = r3.getBsonType()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r2.writeMaxKey()
            goto Lef
        L2c:
            org.bson.BsonDbPointer r3 = r3.asDBPointer()
            r2.writeDBPointer(r3)
            goto Lef
        L35:
            r2.writeMinKey()
            goto Lef
        L3a:
            org.bson.BsonDecimal128 r3 = r3.asDecimal128()
            org.bson.types.Decimal128 r3 = r3.getValue()
            r2.writeDecimal128(r3)
            goto Lef
        L47:
            org.bson.BsonInt64 r3 = r3.asInt64()
            long r0 = r3.getValue()
            r2.writeInt64(r0)
            goto Lef
        L54:
            org.bson.BsonTimestamp r3 = r3.asTimestamp()
            r2.writeTimestamp(r3)
            goto Lef
        L5d:
            org.bson.BsonInt32 r3 = r3.asInt32()
            int r3 = r3.getValue()
            r2.writeInt32(r3)
            goto Lef
        L6a:
            org.bson.BsonJavaScriptWithScope r3 = r3.asJavaScriptWithScope()
            r2.pipeJavascriptWithScope(r3)
            goto Lef
        L73:
            org.bson.BsonSymbol r3 = r3.asSymbol()
            java.lang.String r3 = r3.getSymbol()
            r2.writeSymbol(r3)
            goto Lef
        L80:
            org.bson.BsonJavaScript r3 = r3.asJavaScript()
            java.lang.String r3 = r3.getCode()
            r2.writeJavaScript(r3)
            goto Lef
        L8c:
            org.bson.BsonRegularExpression r3 = r3.asRegularExpression()
            r2.writeRegularExpression(r3)
            goto Lef
        L94:
            r2.writeNull()
            goto Lef
        L98:
            org.bson.BsonDateTime r3 = r3.asDateTime()
            long r0 = r3.getValue()
            r2.writeDateTime(r0)
            goto Lef
        La4:
            org.bson.BsonBoolean r3 = r3.asBoolean()
            boolean r3 = r3.getValue()
            r2.writeBoolean(r3)
            goto Lef
        Lb0:
            org.bson.BsonObjectId r3 = r3.asObjectId()
            org.bson.types.ObjectId r3 = r3.getValue()
            r2.writeObjectId(r3)
            goto Lef
        Lbc:
            r2.writeUndefined()
            goto Lef
        Lc0:
            org.bson.BsonBinary r3 = r3.asBinary()
            r2.writeBinaryData(r3)
            goto Lef
        Lc8:
            org.bson.BsonString r3 = r3.asString()
            java.lang.String r3 = r3.getValue()
            r2.writeString(r3)
            goto Lef
        Ld4:
            org.bson.BsonDouble r3 = r3.asDouble()
            double r0 = r3.getValue()
            r2.writeDouble(r0)
            goto Lef
        Le0:
            org.bson.BsonArray r3 = r3.asArray()
            r2.pipeArray(r3)
            goto Lef
        Le8:
            org.bson.BsonDocument r3 = r3.asDocument()
            r2.pipeDocument(r3)
        Lef:
            return
    }

    public boolean abortPipe() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void checkPreconditions(java.lang.String r6, org.bson.AbstractBsonWriter.State... r7) {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L1c
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L14
            r3 = r7[r2]
            org.bson.AbstractBsonWriter$State r4 = r5.state
            if (r3 != r4) goto L11
            r1 = 1
            goto L14
        L11:
            int r2 = r2 + 1
            goto L7
        L14:
            if (r1 == 0) goto L17
            return
        L17:
            r5.throwInvalidState(r6, r7)
            r6 = 0
            throw r6
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "BsonWriter is closed"
            r6.<init>(r7)
            throw r6
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.closed = r0
            return
    }

    public abstract void doWriteBinaryData(org.bson.BsonBinary r1);

    public abstract void doWriteBoolean(boolean r1);

    public abstract void doWriteDBPointer(org.bson.BsonDbPointer r1);

    public abstract void doWriteDateTime(long r1);

    public abstract void doWriteDecimal128(org.bson.types.Decimal128 r1);

    public abstract void doWriteDouble(double r1);

    public abstract void doWriteEndArray();

    public abstract void doWriteEndDocument();

    public abstract void doWriteInt32(int r1);

    public abstract void doWriteInt64(long r1);

    public abstract void doWriteJavaScript(java.lang.String r1);

    public abstract void doWriteJavaScriptWithScope(java.lang.String r1);

    public abstract void doWriteMaxKey();

    public abstract void doWriteMinKey();

    public void doWriteName(java.lang.String r1) {
            r0 = this;
            return
    }

    public abstract void doWriteNull();

    public abstract void doWriteObjectId(org.bson.types.ObjectId r1);

    public abstract void doWriteRegularExpression(org.bson.BsonRegularExpression r1);

    public abstract void doWriteStartArray();

    public abstract void doWriteStartDocument();

    public abstract void doWriteString(java.lang.String r1);

    public abstract void doWriteSymbol(java.lang.String r1);

    public abstract void doWriteTimestamp(org.bson.BsonTimestamp r1);

    public abstract void doWriteUndefined();

    public org.bson.AbstractBsonWriter.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonWriter$Context r0 = r1.context
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            org.bson.AbstractBsonWriter$Context r0 = r1.context
            java.lang.String r0 = org.bson.AbstractBsonWriter.Context.access$000(r0)
            return r0
    }

    public final org.bson.AbstractBsonWriter.State getNextState() {
            r2 = this;
            org.bson.AbstractBsonWriter$Context r0 = r2.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY
            if (r0 != r1) goto Lf
            org.bson.AbstractBsonWriter$State r0 = org.bson.AbstractBsonWriter.State.VALUE
            return r0
        Lf:
            org.bson.AbstractBsonWriter$State r0 = org.bson.AbstractBsonWriter.State.NAME
            return r0
    }

    public final org.bson.AbstractBsonWriter.State getState() {
            r1 = this;
            org.bson.AbstractBsonWriter$State r0 = r1.state
            return r0
    }

    @Override // org.bson.BsonWriter
    public void pipe(org.bson.BsonReader r2) {
            r1 = this;
            java.lang.String r0 = "reader"
            org.bson.assertions.Assertions.notNull(r0, r2)
            r0 = 0
            r1.pipeDocument(r2, r0)
            return
    }

    public void pipe(org.bson.BsonReader r2, java.util.List<org.bson.BsonElement> r3) {
            r1 = this;
            java.lang.String r0 = "reader"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "extraElements"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.pipeDocument(r2, r3)
            return
    }

    public final void pipeExtraElements(java.util.List<org.bson.BsonElement> r3) {
            r2 = this;
            java.lang.String r0 = "extraElements"
            org.bson.assertions.Assertions.notNull(r0, r3)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            org.bson.BsonElement r0 = (org.bson.BsonElement) r0
            java.lang.String r1 = r0.getName()
            r2.writeName(r1)
            org.bson.BsonValue r0 = r0.getValue()
            r2.pipeValue(r0)
            goto L9
        L24:
            return
    }

    public final void setContext(org.bson.AbstractBsonWriter.Context r1) {
            r0 = this;
            r0.context = r1
            return
    }

    public final void setState(org.bson.AbstractBsonWriter.State r1) {
            r0 = this;
            r0.state = r1
            return
    }

    public final void throwInvalidContextType(java.lang.String r4, org.bson.BsonContextType r5, org.bson.BsonContextType... r6) {
            r3 = this;
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.String r0 = " or "
            java.lang.String r6 = org.bson.StringUtils.join(r0, r6)
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r6
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "%s can only be called when ContextType is %s, not when ContextType is %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public final void throwInvalidState(java.lang.String r7, org.bson.AbstractBsonWriter.State... r8) {
            r6 = this;
            org.bson.AbstractBsonWriter$State r0 = r6.state
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == r1) goto L12
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT
            if (r0 == r1) goto L12
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.DONE
            if (r0 != r1) goto L89
        L12:
            java.lang.String r0 = "end"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L89
            java.lang.String r0 = "writeName"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L89
            r8 = 5
            java.lang.String r7 = r7.substring(r8)
            java.lang.String r0 = "start"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L35
            java.lang.String r7 = r7.substring(r8)
        L35:
            java.lang.Character[] r8 = new java.lang.Character[r8]
            r0 = 65
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r8[r5] = r0
            r0 = 69
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r8[r4] = r0
            r0 = 73
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r8[r3] = r0
            r0 = 79
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r8[r2] = r0
            r0 = 4
            r1 = 85
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8[r0] = r1
            java.util.List r8 = java.util.Arrays.asList(r8)
            char r0 = r7.charAt(r5)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L75
            java.lang.String r8 = "An"
            goto L77
        L75:
            java.lang.String r8 = "A"
        L77:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r8
            r1[r4] = r7
            java.lang.String r7 = "%s %s value cannot be written to the root level of a BSON document."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.<init>(r7)
            throw r0
        L89:
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.String r0 = " or "
            java.lang.String r8 = org.bson.StringUtils.join(r0, r8)
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r7
            r1[r4] = r8
            org.bson.AbstractBsonWriter$State r7 = r6.state
            r1[r3] = r7
            java.lang.String r7 = "%s can only be called when State is %s, not when State is %s"
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.<init>(r7)
            throw r0
    }

    @Override // org.bson.BsonWriter
    public void writeBinaryData(java.lang.String r2, org.bson.BsonBinary r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeBinaryData(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeBinaryData(org.bson.BsonBinary r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 2
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "writeBinaryData"
            r3.checkPreconditions(r1, r0)
            r3.doWriteBinaryData(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.writeName(r1)
            r0.writeBoolean(r2)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeBoolean(boolean r4) {
            r3 = this;
            r0 = 2
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "writeBoolean"
            r3.checkPreconditions(r1, r0)
            r3.doWriteBoolean(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDBPointer(java.lang.String r2, org.bson.BsonDbPointer r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeDBPointer(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDBPointer(org.bson.BsonDbPointer r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 2
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "writeDBPointer"
            r3.checkPreconditions(r1, r0)
            r3.doWriteDBPointer(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDateTime(long r4) {
            r3 = this;
            r0 = 2
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "writeDateTime"
            r3.checkPreconditions(r1, r0)
            r3.doWriteDateTime(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDateTime(java.lang.String r1, long r2) {
            r0 = this;
            r0.writeName(r1)
            r0.writeDateTime(r2)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDecimal128(java.lang.String r2, org.bson.types.Decimal128 r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeDecimal128(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDecimal128(org.bson.types.Decimal128 r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeInt64"
            r3.checkPreconditions(r1, r0)
            r3.doWriteDecimal128(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDouble(double r4) {
            r3 = this;
            r0 = 2
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "writeDBPointer"
            r3.checkPreconditions(r1, r0)
            r3.doWriteDouble(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeDouble(java.lang.String r1, double r2) {
            r0 = this;
            r0.writeName(r1)
            r0.writeDouble(r2)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeEndArray() {
            r4 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r1 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r2 = org.bson.AbstractBsonWriter.State.VALUE
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "writeEndArray"
            r4.checkPreconditions(r2, r1)
            org.bson.AbstractBsonWriter$Context r1 = r4.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.ARRAY
            if (r1 != r2) goto L42
            org.bson.AbstractBsonWriter$Context r1 = r4.context
            org.bson.AbstractBsonWriter$Context r1 = r1.getParentContext()
            if (r1 == 0) goto L33
            org.bson.AbstractBsonWriter$Context r1 = r4.context
            org.bson.AbstractBsonWriter$Context r1 = r1.getParentContext()
            java.lang.String r1 = org.bson.AbstractBsonWriter.Context.access$000(r1)
            if (r1 == 0) goto L33
            java.util.Stack<org.bson.FieldNameValidator> r1 = r4.fieldNameValidatorStack
            r1.pop()
        L33:
            int r1 = r4.serializationDepth
            int r1 = r1 - r0
            r4.serializationDepth = r1
            r4.doWriteEndArray()
            org.bson.AbstractBsonWriter$State r0 = r4.getNextState()
            r4.state = r0
            return
        L42:
            org.bson.AbstractBsonWriter$Context r1 = r4.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            org.bson.BsonContextType[] r0 = new org.bson.BsonContextType[r0]
            r0[r3] = r2
            java.lang.String r2 = "WriteEndArray"
            r4.throwInvalidContextType(r2, r1, r0)
            r0 = 0
            throw r0
    }

    @Override // org.bson.BsonWriter
    public void writeEndDocument() {
            r6 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r1 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r2 = org.bson.AbstractBsonWriter.State.NAME
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "writeEndDocument"
            r6.checkPreconditions(r2, r1)
            org.bson.AbstractBsonWriter$Context r1 = r6.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.DOCUMENT
            if (r1 == r2) goto L2d
            org.bson.BsonContextType r4 = org.bson.BsonContextType.SCOPE_DOCUMENT
            if (r1 != r4) goto L1f
            goto L2d
        L1f:
            r5 = 2
            org.bson.BsonContextType[] r5 = new org.bson.BsonContextType[r5]
            r5[r3] = r2
            r5[r0] = r4
            java.lang.String r0 = "WriteEndDocument"
            r6.throwInvalidContextType(r0, r1, r5)
            r0 = 0
            throw r0
        L2d:
            org.bson.AbstractBsonWriter$Context r1 = r6.context
            org.bson.AbstractBsonWriter$Context r1 = r1.getParentContext()
            if (r1 == 0) goto L46
            org.bson.AbstractBsonWriter$Context r1 = r6.context
            org.bson.AbstractBsonWriter$Context r1 = r1.getParentContext()
            java.lang.String r1 = org.bson.AbstractBsonWriter.Context.access$000(r1)
            if (r1 == 0) goto L46
            java.util.Stack<org.bson.FieldNameValidator> r1 = r6.fieldNameValidatorStack
            r1.pop()
        L46:
            int r1 = r6.serializationDepth
            int r1 = r1 - r0
            r6.serializationDepth = r1
            r6.doWriteEndDocument()
            org.bson.AbstractBsonWriter$Context r0 = r6.getContext()
            if (r0 == 0) goto L68
            org.bson.AbstractBsonWriter$Context r0 = r6.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL
            if (r0 != r1) goto L61
            goto L68
        L61:
            org.bson.AbstractBsonWriter$State r0 = r6.getNextState()
            r6.state = r0
            goto L6c
        L68:
            org.bson.AbstractBsonWriter$State r0 = org.bson.AbstractBsonWriter.State.DONE
            r6.state = r0
        L6c:
            return
    }

    @Override // org.bson.BsonWriter
    public void writeInt32(int r4) {
            r3 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeInt32"
            r3.checkPreconditions(r1, r0)
            r3.doWriteInt32(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeInt32(java.lang.String r1, int r2) {
            r0 = this;
            r0.writeName(r1)
            r0.writeInt32(r2)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeInt64(long r4) {
            r3 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeInt64"
            r3.checkPreconditions(r1, r0)
            r3.doWriteInt64(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeInt64(java.lang.String r1, long r2) {
            r0 = this;
            r0.writeName(r1)
            r0.writeInt64(r2)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScript(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeJavaScript"
            r3.checkPreconditions(r1, r0)
            r3.doWriteJavaScript(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScript(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeJavaScript(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScriptWithScope(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeJavaScriptWithScope"
            r3.checkPreconditions(r1, r0)
            r3.doWriteJavaScriptWithScope(r4)
            org.bson.AbstractBsonWriter$State r4 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScriptWithScope(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeJavaScriptWithScope(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeMaxKey() {
            r3 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeMaxKey"
            r3.checkPreconditions(r1, r0)
            r3.doWriteMaxKey()
            org.bson.AbstractBsonWriter$State r0 = r3.getNextState()
            r3.state = r0
            return
    }

    @Override // org.bson.BsonWriter
    public void writeMaxKey(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeMaxKey()
            return
    }

    @Override // org.bson.BsonWriter
    public void writeMinKey() {
            r3 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeMinKey"
            r3.checkPreconditions(r1, r0)
            r3.doWriteMinKey()
            org.bson.AbstractBsonWriter$State r0 = r3.getNextState()
            r3.state = r0
            return
    }

    @Override // org.bson.BsonWriter
    public void writeMinKey(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeMinKey()
            return
    }

    @Override // org.bson.BsonWriter
    public void writeName(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r5)
            org.bson.AbstractBsonWriter$State r0 = r4.state
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.NAME
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L38
            java.util.Stack<org.bson.FieldNameValidator> r0 = r4.fieldNameValidatorStack
            java.lang.Object r0 = r0.peek()
            org.bson.FieldNameValidator r0 = (org.bson.FieldNameValidator) r0
            boolean r0 = r0.validate(r5)
            if (r0 == 0) goto L28
            r4.doWriteName(r5)
            org.bson.AbstractBsonWriter$Context r0 = r4.context
            org.bson.AbstractBsonWriter.Context.access$002(r0, r5)
            org.bson.AbstractBsonWriter$State r5 = org.bson.AbstractBsonWriter.State.VALUE
            r4.state = r5
            return
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "Invalid BSON field name %s"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5)
            throw r0
        L38:
            org.bson.AbstractBsonWriter$State[] r5 = new org.bson.AbstractBsonWriter.State[r3]
            r5[r2] = r1
            java.lang.String r0 = "WriteName"
            r4.throwInvalidState(r0, r5)
            r5 = 0
            throw r5
    }

    @Override // org.bson.BsonWriter
    public void writeNull() {
            r3 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeNull"
            r3.checkPreconditions(r1, r0)
            r3.doWriteNull()
            org.bson.AbstractBsonWriter$State r0 = r3.getNextState()
            r3.state = r0
            return
    }

    @Override // org.bson.BsonWriter
    public void writeNull(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeNull()
            return
    }

    @Override // org.bson.BsonWriter
    public void writeObjectId(java.lang.String r2, org.bson.types.ObjectId r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeObjectId(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeObjectId(org.bson.types.ObjectId r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeObjectId"
            r3.checkPreconditions(r1, r0)
            r3.doWriteObjectId(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeRegularExpression(java.lang.String r2, org.bson.BsonRegularExpression r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeRegularExpression(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeRegularExpression(org.bson.BsonRegularExpression r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeRegularExpression"
            r3.checkPreconditions(r1, r0)
            r3.doWriteRegularExpression(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeStartArray() {
            r5 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r1 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r2 = org.bson.AbstractBsonWriter.State.VALUE
            r3 = 0
            r1[r3] = r2
            java.lang.String r3 = "writeStartArray"
            r5.checkPreconditions(r3, r1)
            org.bson.AbstractBsonWriter$Context r1 = r5.context
            if (r1 == 0) goto L2b
            java.lang.String r1 = org.bson.AbstractBsonWriter.Context.access$000(r1)
            if (r1 == 0) goto L2b
            java.util.Stack<org.bson.FieldNameValidator> r1 = r5.fieldNameValidatorStack
            java.lang.Object r3 = r1.peek()
            org.bson.FieldNameValidator r3 = (org.bson.FieldNameValidator) r3
            java.lang.String r4 = r5.getName()
            org.bson.FieldNameValidator r3 = r3.getValidatorForField(r4)
            r1.push(r3)
        L2b:
            int r1 = r5.serializationDepth
            int r1 = r1 + r0
            r5.serializationDepth = r1
            org.bson.BsonWriterSettings r0 = r5.settings
            int r0 = r0.getMaxSerializationDepth()
            if (r1 > r0) goto L3e
            r5.doWriteStartArray()
            r5.state = r2
            return
        L3e:
            org.bson.BsonSerializationException r0 = new org.bson.BsonSerializationException
            java.lang.String r1 = "Maximum serialization depth exceeded (does the object being serialized have a circular reference?)."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonWriter
    public void writeStartArray(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeStartArray()
            return
    }

    @Override // org.bson.BsonWriter
    public void writeStartDocument() {
            r4 = this;
            r0 = 4
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL
            r2 = 0
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 1
            r0[r2] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT
            r3 = 2
            r0[r3] = r1
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.DONE
            r3 = 3
            r0[r3] = r1
            java.lang.String r1 = "writeStartDocument"
            r4.checkPreconditions(r1, r0)
            org.bson.AbstractBsonWriter$Context r0 = r4.context
            if (r0 == 0) goto L3a
            java.lang.String r0 = org.bson.AbstractBsonWriter.Context.access$000(r0)
            if (r0 == 0) goto L3a
            java.util.Stack<org.bson.FieldNameValidator> r0 = r4.fieldNameValidatorStack
            java.lang.Object r1 = r0.peek()
            org.bson.FieldNameValidator r1 = (org.bson.FieldNameValidator) r1
            java.lang.String r3 = r4.getName()
            org.bson.FieldNameValidator r1 = r1.getValidatorForField(r3)
            r0.push(r1)
        L3a:
            int r0 = r4.serializationDepth
            int r0 = r0 + r2
            r4.serializationDepth = r0
            org.bson.BsonWriterSettings r1 = r4.settings
            int r1 = r1.getMaxSerializationDepth()
            if (r0 > r1) goto L4f
            r4.doWriteStartDocument()
            org.bson.AbstractBsonWriter$State r0 = org.bson.AbstractBsonWriter.State.NAME
            r4.state = r0
            return
        L4f:
            org.bson.BsonSerializationException r0 = new org.bson.BsonSerializationException
            java.lang.String r1 = "Maximum serialization depth exceeded (does the object being serialized have a circular reference?)."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonWriter
    public void writeStartDocument(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeStartDocument()
            return
    }

    @Override // org.bson.BsonWriter
    public void writeString(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeString"
            r3.checkPreconditions(r1, r0)
            r3.doWriteString(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeString(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeSymbol(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeSymbol"
            r3.checkPreconditions(r1, r0)
            r3.doWriteSymbol(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeSymbol(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeSymbol(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeTimestamp(java.lang.String r2, org.bson.BsonTimestamp r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeTimestamp(r3)
            return
    }

    @Override // org.bson.BsonWriter
    public void writeTimestamp(org.bson.BsonTimestamp r4) {
            r3 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeTimestamp"
            r3.checkPreconditions(r1, r0)
            r3.doWriteTimestamp(r4)
            org.bson.AbstractBsonWriter$State r4 = r3.getNextState()
            r3.state = r4
            return
    }

    @Override // org.bson.BsonWriter
    public void writeUndefined() {
            r3 = this;
            r0 = 1
            org.bson.AbstractBsonWriter$State[] r0 = new org.bson.AbstractBsonWriter.State[r0]
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "writeUndefined"
            r3.checkPreconditions(r1, r0)
            r3.doWriteUndefined()
            org.bson.AbstractBsonWriter$State r0 = r3.getNextState()
            r3.state = r0
            return
    }

    @Override // org.bson.BsonWriter
    public void writeUndefined(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeUndefined()
            return
    }
}
