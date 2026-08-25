package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
public class JsonReader extends org.bson.AbstractBsonReader {
    private java.lang.Object currentValue;
    private org.bson.json.JsonReader.Mark mark;
    private org.bson.json.JsonToken pushedToken;
    private final org.bson.json.JsonScanner scanner;

    /* JADX INFO: renamed from: org.bson.json.JsonReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonContextType = null;
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;
        public static final /* synthetic */ int[] $SwitchMap$org$bson$json$JsonTokenType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType = r0
                r1 = 1
                org.bson.BsonType r2 = org.bson.BsonType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r3 = org.bson.BsonType.BINARY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r4 = org.bson.BsonType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r5 = org.bson.BsonType.DATE_TIME     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L3e
                org.bson.BsonType r6 = org.bson.BsonType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L49
                org.bson.BsonType r7 = org.bson.BsonType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                r6 = 7
                int[] r7 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L54
                org.bson.BsonType r8 = org.bson.BsonType.INT32     // Catch: java.lang.NoSuchFieldError -> L54
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7[r8] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                r7 = 8
                int[] r8 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L60
                org.bson.BsonType r9 = org.bson.BsonType.INT64     // Catch: java.lang.NoSuchFieldError -> L60
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r8[r9] = r7     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                r8 = 9
                int[] r9 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L6c
                org.bson.BsonType r10 = org.bson.BsonType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L6c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r9[r10] = r8     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                r9 = 10
                int[] r10 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L78
                org.bson.BsonType r11 = org.bson.BsonType.JAVASCRIPT     // Catch: java.lang.NoSuchFieldError -> L78
                int r11 = r11.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r10[r11] = r9     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                r10 = 11
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L84
                org.bson.BsonType r12 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> L84
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r11[r12] = r10     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L90
                org.bson.BsonType r12 = org.bson.BsonType.MAX_KEY     // Catch: java.lang.NoSuchFieldError -> L90
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r13 = 12
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L9c
                org.bson.BsonType r12 = org.bson.BsonType.MIN_KEY     // Catch: java.lang.NoSuchFieldError -> L9c
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r13 = 13
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> La8
                org.bson.BsonType r12 = org.bson.BsonType.NULL     // Catch: java.lang.NoSuchFieldError -> La8
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r13 = 14
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lb4
                org.bson.BsonType r12 = org.bson.BsonType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r13 = 15
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lc0
                org.bson.BsonType r12 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r13 = 16
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lcc
                org.bson.BsonType r12 = org.bson.BsonType.STRING     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r13 = 17
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Ld8
                org.bson.BsonType r12 = org.bson.BsonType.SYMBOL     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r13 = 18
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Le4
                org.bson.BsonType r12 = org.bson.BsonType.TIMESTAMP     // Catch: java.lang.NoSuchFieldError -> Le4
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r13 = 19
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lf0
                org.bson.BsonType r12 = org.bson.BsonType.UNDEFINED     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r13 = 20
                r11[r12] = r13     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                org.bson.BsonContextType[] r11 = org.bson.BsonContextType.values()
                int r11 = r11.length
                int[] r11 = new int[r11]
                org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType = r11
                org.bson.BsonContextType r12 = org.bson.BsonContextType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L101
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L101
                r11[r12] = r1     // Catch: java.lang.NoSuchFieldError -> L101
            L101:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L10b
                org.bson.BsonContextType r12 = org.bson.BsonContextType.SCOPE_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L10b
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10b
                r11[r12] = r0     // Catch: java.lang.NoSuchFieldError -> L10b
            L10b:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L115
                org.bson.BsonContextType r12 = org.bson.BsonContextType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L115
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L115
                r11[r12] = r2     // Catch: java.lang.NoSuchFieldError -> L115
            L115:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L11f
                org.bson.BsonContextType r12 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> L11f
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11f
                r11[r12] = r3     // Catch: java.lang.NoSuchFieldError -> L11f
            L11f:
                int[] r11 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L129
                org.bson.BsonContextType r12 = org.bson.BsonContextType.TOP_LEVEL     // Catch: java.lang.NoSuchFieldError -> L129
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L129
                r11[r12] = r4     // Catch: java.lang.NoSuchFieldError -> L129
            L129:
                org.bson.json.JsonTokenType[] r11 = org.bson.json.JsonTokenType.values()
                int r11 = r11.length
                int[] r11 = new int[r11]
                org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType = r11
                org.bson.json.JsonTokenType r12 = org.bson.json.JsonTokenType.STRING     // Catch: java.lang.NoSuchFieldError -> L13a
                int r12 = r12.ordinal()     // Catch: java.lang.NoSuchFieldError -> L13a
                r11[r12] = r1     // Catch: java.lang.NoSuchFieldError -> L13a
            L13a:
                int[] r1 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L144
                org.bson.json.JsonTokenType r11 = org.bson.json.JsonTokenType.UNQUOTED_STRING     // Catch: java.lang.NoSuchFieldError -> L144
                int r11 = r11.ordinal()     // Catch: java.lang.NoSuchFieldError -> L144
                r1[r11] = r0     // Catch: java.lang.NoSuchFieldError -> L144
            L144:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L14e
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT     // Catch: java.lang.NoSuchFieldError -> L14e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L14e
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L14e
            L14e:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L158
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L158
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L158
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L158
            L158:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L162
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L162
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L162
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L162
            L162:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L16c
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L16c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L16c
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L16c
            L16c:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L176
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OF_FILE     // Catch: java.lang.NoSuchFieldError -> L176
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L176
                r0[r1] = r6     // Catch: java.lang.NoSuchFieldError -> L176
            L176:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L180
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.INT32     // Catch: java.lang.NoSuchFieldError -> L180
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L180
                r0[r1] = r7     // Catch: java.lang.NoSuchFieldError -> L180
            L180:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L18a
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.INT64     // Catch: java.lang.NoSuchFieldError -> L18a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L18a
                r0[r1] = r8     // Catch: java.lang.NoSuchFieldError -> L18a
            L18a:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L194
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.REGULAR_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> L194
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L194
                r0[r1] = r9     // Catch: java.lang.NoSuchFieldError -> L194
            L194:
                int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType     // Catch: java.lang.NoSuchFieldError -> L19e
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.NoSuchFieldError -> L19e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19e
                r0[r1] = r10     // Catch: java.lang.NoSuchFieldError -> L19e
            L19e:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Context extends org.bson.AbstractBsonReader.Context {
        public Context(org.bson.json.JsonReader r1, org.bson.AbstractBsonReader.Context r2, org.bson.BsonContextType r3) {
                r0 = this;
                r0.<init>(r2, r3)
                return
        }

        @Override // org.bson.AbstractBsonReader.Context
        public final org.bson.BsonContextType getContextType() {
                r1 = this;
                org.bson.BsonContextType r0 = super.getContextType()
                return r0
        }

        @Override // org.bson.AbstractBsonReader.Context
        public final org.bson.json.JsonReader.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonReader$Context r0 = r1.getParentContext()
                org.bson.json.JsonReader$Context r0 = (org.bson.json.JsonReader.Context) r0
                return r0
        }
    }

    public class Mark extends org.bson.AbstractBsonReader.Mark {
        private final java.lang.Object currentValue;
        private final int markPos;
        private final org.bson.json.JsonToken pushedToken;
        public final /* synthetic */ org.bson.json.JsonReader this$0;

        public Mark(org.bson.json.JsonReader r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                org.bson.json.JsonToken r0 = org.bson.json.JsonReader.access$000(r2)
                r1.pushedToken = r0
                java.lang.Object r0 = org.bson.json.JsonReader.access$100(r2)
                r1.currentValue = r0
                org.bson.json.JsonScanner r2 = org.bson.json.JsonReader.access$200(r2)
                int r2 = r2.mark()
                r1.markPos = r2
                return
        }

        public void discard() {
                r2 = this;
                org.bson.json.JsonReader r0 = r2.this$0
                org.bson.json.JsonScanner r0 = org.bson.json.JsonReader.access$200(r0)
                int r1 = r2.markPos
                r0.discard(r1)
                return
        }

        @Override // org.bson.AbstractBsonReader.Mark, org.bson.BsonReaderMark
        public void reset() {
                r4 = this;
                super.reset()
                org.bson.json.JsonReader r0 = r4.this$0
                org.bson.json.JsonToken r1 = r4.pushedToken
                org.bson.json.JsonReader.access$002(r0, r1)
                org.bson.json.JsonReader r0 = r4.this$0
                java.lang.Object r1 = r4.currentValue
                org.bson.json.JsonReader.access$102(r0, r1)
                org.bson.json.JsonReader r0 = r4.this$0
                org.bson.json.JsonScanner r0 = org.bson.json.JsonReader.access$200(r0)
                int r1 = r4.markPos
                r0.reset(r1)
                org.bson.json.JsonReader r0 = r4.this$0
                org.bson.json.JsonReader$Context r1 = new org.bson.json.JsonReader$Context
                org.bson.AbstractBsonReader$Context r2 = r4.getParentContext()
                org.bson.BsonContextType r3 = r4.getContextType()
                r1.<init>(r0, r2, r3)
                r0.setContext(r1)
                return
        }
    }

    public JsonReader(java.io.Reader r2) {
            r1 = this;
            org.bson.json.JsonScanner r0 = new org.bson.json.JsonScanner
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public JsonReader(java.lang.String r2) {
            r1 = this;
            org.bson.json.JsonScanner r0 = new org.bson.json.JsonScanner
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private JsonReader(org.bson.json.JsonScanner r3) {
            r2 = this;
            r2.<init>()
            r2.scanner = r3
            org.bson.json.JsonReader$Context r3 = new org.bson.json.JsonReader$Context
            org.bson.BsonContextType r0 = org.bson.BsonContextType.TOP_LEVEL
            r1 = 0
            r3.<init>(r2, r1, r0)
            r2.setContext(r3)
            return
    }

    public static /* synthetic */ org.bson.json.JsonToken access$000(org.bson.json.JsonReader r0) {
            org.bson.json.JsonToken r0 = r0.pushedToken
            return r0
    }

    public static /* synthetic */ org.bson.json.JsonToken access$002(org.bson.json.JsonReader r0, org.bson.json.JsonToken r1) {
            r0.pushedToken = r1
            return r1
    }

    public static /* synthetic */ java.lang.Object access$100(org.bson.json.JsonReader r0) {
            java.lang.Object r0 = r0.currentValue
            return r0
    }

    public static /* synthetic */ java.lang.Object access$102(org.bson.json.JsonReader r0, java.lang.Object r1) {
            r0.currentValue = r1
            return r1
    }

    public static /* synthetic */ org.bson.json.JsonScanner access$200(org.bson.json.JsonReader r0) {
            org.bson.json.JsonScanner r0 = r0.scanner
            return r0
    }

    private static byte[] decodeHex(java.lang.String r5) {
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L48
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r0 = new byte[r0]
            r1 = 0
        L11:
            int r2 = r5.length()
            if (r1 >= r2) goto L47
            char r2 = r5.charAt(r1)
            r3 = 16
            int r2 = java.lang.Character.digit(r2, r3)
            int r4 = r1 + 1
            char r4 = r5.charAt(r4)
            int r3 = java.lang.Character.digit(r4, r3)
            r4 = -1
            if (r2 == r4) goto L3b
            if (r3 == r4) goto L3b
            int r4 = r1 / 2
            int r2 = r2 * 16
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r0[r4] = r2
            int r1 = r1 + 2
            goto L11
        L3b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A hex string can only contain the characters 0-9, A-F, a-f: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5)
            r0.<init>(r5)
            throw r0
        L47:
            return r0
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A hex string must contain an even number of characters: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5)
            r0.<init>(r5)
            throw r0
    }

    private org.bson.json.JsonToken popToken() {
            r2 = this;
            org.bson.json.JsonToken r0 = r2.pushedToken
            if (r0 == 0) goto L8
            r1 = 0
            r2.pushedToken = r1
            return r0
        L8:
            org.bson.json.JsonScanner r0 = r2.scanner
            org.bson.json.JsonToken r0 = r0.nextToken()
            return r0
    }

    private void pushToken(org.bson.json.JsonToken r2) {
            r1 = this;
            org.bson.json.JsonToken r0 = r1.pushedToken
            if (r0 != 0) goto L7
            r1.pushedToken = r2
            return
        L7:
            org.bson.BsonInvalidOperationException r2 = new org.bson.BsonInvalidOperationException
            java.lang.String r0 = "There is already a pending token."
            r2.<init>(r0)
            throw r2
    }

    private byte readBinarySubtypeFromExtendedJson() {
            r4 = this;
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.STRING
            if (r1 == r2) goto L27
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.INT32
            if (r1 != r3) goto L15
            goto L27
        L15:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected a string or number but found '%s'."
            r1.<init>(r0, r2)
            throw r1
        L27:
            org.bson.json.JsonTokenType r1 = r0.getType()
            if (r1 != r2) goto L3d
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)
            byte r0 = (byte) r0
            return r0
        L3d:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            byte r0 = r0.byteValue()
            return r0
    }

    private org.bson.types.ObjectId readDbPointerIdFromExtendedJson() {
            r2 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r2.verifyToken(r0)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.BEGIN_OBJECT
            r2.verifyToken(r0)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.STRING
            java.lang.String r1 = "$oid"
            r2.verifyToken(r0, r1)
            org.bson.types.ObjectId r0 = r2.visitObjectIdExtendedJson()
            return r0
    }

    private int readIntFromExtendedJson() {
            r4 = this;
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            if (r1 != r2) goto L19
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L2d
        L19:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT64
            if (r1 != r2) goto L2e
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = r0.intValue()
        L2d:
            return r0
        L2e:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected an integer but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    private java.lang.String readStringFromExtendedJson() {
            r4 = this;
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.STRING
            if (r1 != r2) goto L15
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L15:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected a string but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    private void verifyString(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L32
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.STRING
            if (r1 == r2) goto L12
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.UNQUOTED_STRING
            if (r1 != r2) goto L1d
        L12:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L1d
            return
        L1d:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            java.lang.Object r0 = r0.getValue()
            r2[r5] = r0
            java.lang.String r5 = "JSON reader expected '%s' but found '%s'."
            r1.<init>(r5, r2)
            throw r1
        L32:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't be null"
            r5.<init>(r0)
            throw r5
    }

    private void verifyToken(org.bson.json.JsonTokenType r5) {
            r4 = this;
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            if (r5 != r1) goto Lb
            return
        Lb:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            java.lang.Object r0 = r0.getValue()
            r2[r5] = r0
            java.lang.String r5 = "JSON reader expected token type '%s' but found '%s'."
            r1.<init>(r5, r2)
            throw r1
    }

    private void verifyToken(org.bson.json.JsonTokenType r6, java.lang.Object r7) {
            r5 = this;
            org.bson.json.JsonToken r0 = r5.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r6 != r1) goto L2a
            java.lang.Object r6 = r0.getValue()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L18
            return
        L18:
            org.bson.json.JsonParseException r6 = new org.bson.json.JsonParseException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            java.lang.Object r7 = r0.getValue()
            r1[r2] = r7
            java.lang.String r7 = "JSON reader expected '%s' but found '%s'."
            r6.<init>(r7, r1)
            throw r6
        L2a:
            org.bson.json.JsonParseException r7 = new org.bson.json.JsonParseException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            java.lang.Object r6 = r0.getValue()
            r1[r2] = r6
            java.lang.String r6 = "JSON reader expected token type '%s' but found '%s'."
            r7.<init>(r6, r1)
            throw r7
    }

    private org.bson.BsonBinary visitBinDataConstructor() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r6.verifyToken(r0)
            org.bson.json.JsonToken r0 = r6.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L60
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA
            r6.verifyToken(r1)
            org.bson.json.JsonToken r1 = r6.popToken()
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r5 = org.bson.json.JsonTokenType.UNQUOTED_STRING
            if (r2 == r5) goto L3d
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r5 = org.bson.json.JsonTokenType.STRING
            if (r2 != r5) goto L2d
            goto L3d
        L2d:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r1 = r1.getValue()
            r2[r3] = r1
            java.lang.String r1 = "JSON reader expected a string but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L3d:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r6.verifyToken(r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r1 = r1.getValue(r2)
            java.lang.String r1 = (java.lang.String) r1
            byte[] r1 = org.bson.internal.Base64.decode(r1)
            org.bson.BsonBinary r2 = new org.bson.BsonBinary
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Object r0 = r0.getValue(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            byte r0 = r0.byteValue()
            r2.<init>(r0, r1)
            return r2
        L60:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected a binary subtype but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    private org.bson.BsonBinary visitBinDataExtendedJson(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "base64"
            org.bson.json.JsonReader$Mark r1 = new org.bson.json.JsonReader$Mark
            r1.<init>(r6)
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COLON     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = "$binary"
            boolean r3 = r7.equals(r3)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto La5
            org.bson.json.JsonToken r3 = r6.popToken()     // Catch: java.lang.Throwable -> Lb0
            org.bson.json.JsonTokenType r3 = r3.getType()     // Catch: java.lang.Throwable -> Lb0
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.BEGIN_OBJECT     // Catch: java.lang.Throwable -> Lb0
            if (r3 != r4) goto L9a
            org.bson.json.JsonToken r7 = r6.popToken()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Object r7 = r7.getValue(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lb0
            boolean r3 = r7.equals(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = "subType"
            if (r3 == 0) goto L4f
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = r6.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> Lb0
            byte[] r7 = org.bson.internal.Base64.decode(r7)     // Catch: java.lang.Throwable -> Lb0
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r0)     // Catch: java.lang.Throwable -> Lb0
            r6.verifyString(r4)     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            byte r0 = r6.readBinarySubtypeFromExtendedJson()     // Catch: java.lang.Throwable -> Lb0
            goto L72
        L4f:
            boolean r3 = r7.equals(r4)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L83
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            byte r7 = r6.readBinarySubtypeFromExtendedJson()     // Catch: java.lang.Throwable -> Lb0
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r3)     // Catch: java.lang.Throwable -> Lb0
            r6.verifyString(r0)     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r6.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> Lb0
            byte[] r0 = org.bson.internal.Base64.decode(r0)     // Catch: java.lang.Throwable -> Lb0
            r5 = r0
            r0 = r7
            r7 = r5
        L72:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            r6.verifyToken(r2)     // Catch: java.lang.Throwable -> Lb0
            org.bson.BsonBinary r2 = new org.bson.BsonBinary     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lb0
            r1.discard()
            return r2
        L83:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r2.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = "Unexpected key for $binary: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb0
            r2.append(r7)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r0     // Catch: java.lang.Throwable -> Lb0
        L9a:
            r1.reset()     // Catch: java.lang.Throwable -> Lb0
            org.bson.BsonBinary r7 = r6.visitLegacyBinaryExtendedJson(r7)     // Catch: java.lang.Throwable -> Lb0
            r1.discard()
            return r7
        La5:
            r1.reset()     // Catch: java.lang.Throwable -> Lb0
            org.bson.BsonBinary r7 = r6.visitLegacyBinaryExtendedJson(r7)     // Catch: java.lang.Throwable -> Lb0
            r1.discard()
            return r7
        Lb0:
            r7 = move-exception
            r1.discard()
            throw r7
    }

    private org.bson.BsonDbPointer visitDBPointerConstructor() {
            r3 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r3.verifyToken(r0)
            java.lang.String r0 = r3.readStringFromExtendedJson()
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA
            r3.verifyToken(r1)
            org.bson.types.ObjectId r1 = new org.bson.types.ObjectId
            java.lang.String r2 = r3.readStringFromExtendedJson()
            r1.<init>(r2)
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r3.verifyToken(r2)
            org.bson.BsonDbPointer r2 = new org.bson.BsonDbPointer
            r2.<init>(r0, r1)
            return r2
    }

    private long visitDateTimeConstructor() {
            r9 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = "EEE MMM dd yyyy HH:mm:ss z"
            r0.<init>(r2, r1)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.LEFT_PAREN
            r9.verifyToken(r1)
            org.bson.json.JsonToken r1 = r9.popToken()
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.RIGHT_PAREN
            if (r2 != r3) goto L24
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            return r0
        L24:
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.STRING
            r5 = 1
            r6 = 0
            if (r2 != r4) goto L5f
            r9.verifyToken(r3)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r1 = r1.getValue(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.text.ParsePosition r2 = new java.text.ParsePosition
            r2.<init>(r6)
            java.util.Date r0 = r0.parse(r1, r2)
            if (r0 == 0) goto L53
            int r2 = r2.getIndex()
            int r3 = r1.length()
            if (r2 != r3) goto L53
            long r0 = r0.getTime()
            return r0
        L53:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r1
            java.lang.String r1 = "JSON reader expected a date in 'EEE MMM dd yyyy HH:mm:ss z' format but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L5f:
            org.bson.json.JsonTokenType r0 = r1.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            if (r0 == r2) goto L80
            org.bson.json.JsonTokenType r0 = r1.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT64
            if (r0 != r2) goto L70
            goto L80
        L70:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.getValue()
            r2[r6] = r1
            java.lang.String r1 = "JSON reader expected an integer or a string but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L80:
            r0 = 7
            long[] r2 = new long[r0]
            r3 = 0
        L84:
            if (r3 >= r0) goto L97
            int r4 = r3 + 1
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            java.lang.Object r1 = r1.getValue(r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            r2[r3] = r7
            r3 = r4
        L97:
            org.bson.json.JsonToken r1 = r9.popToken()
            org.bson.json.JsonTokenType r4 = r1.getType()
            org.bson.json.JsonTokenType r7 = org.bson.json.JsonTokenType.RIGHT_PAREN
            if (r4 != r7) goto L102
            if (r3 != r5) goto La8
            r0 = r2[r6]
            return r0
        La8:
            r1 = 3
            if (r3 < r1) goto Lf2
            if (r3 > r0) goto Lf2
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r3 = r2[r6]
            int r4 = (int) r3
            r0.set(r5, r4)
            r3 = r2[r5]
            int r4 = (int) r3
            r3 = 2
            r0.set(r3, r4)
            r3 = r2[r3]
            int r4 = (int) r3
            r3 = 5
            r0.set(r3, r4)
            r4 = 11
            r5 = r2[r1]
            int r1 = (int) r5
            r0.set(r4, r1)
            r1 = 12
            r4 = 4
            r4 = r2[r4]
            int r5 = (int) r4
            r0.set(r1, r5)
            r1 = 13
            r3 = r2[r3]
            int r4 = (int) r3
            r0.set(r1, r4)
            r1 = 14
            r3 = 6
            r3 = r2[r3]
            int r2 = (int) r3
            r0.set(r1, r2)
            long r0 = r0.getTimeInMillis()
            return r0
        Lf2:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r6] = r2
            java.lang.String r2 = "JSON reader expected 1 or 3-7 integers but found %d."
            r0.<init>(r2, r1)
            throw r0
        L102:
            org.bson.json.JsonTokenType r4 = r1.getType()
            org.bson.json.JsonTokenType r7 = org.bson.json.JsonTokenType.COMMA
            if (r4 != r7) goto L130
            org.bson.json.JsonToken r1 = r9.popToken()
            org.bson.json.JsonTokenType r4 = r1.getType()
            org.bson.json.JsonTokenType r7 = org.bson.json.JsonTokenType.INT32
            if (r4 == r7) goto L84
            org.bson.json.JsonTokenType r4 = r1.getType()
            org.bson.json.JsonTokenType r7 = org.bson.json.JsonTokenType.INT64
            if (r4 != r7) goto L120
            goto L84
        L120:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.getValue()
            r2[r6] = r1
            java.lang.String r1 = "JSON reader expected an integer but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L130:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.getValue()
            r2[r6] = r1
            java.lang.String r1 = "JSON reader expected a ',' or a ')' but found '%s'."
            r0.<init>(r1, r2)
            throw r0
    }

    private java.lang.String visitDateTimeConstructorWithOutNew() {
            r4 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r4.verifyToken(r0)
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            if (r1 == r2) goto L40
        L11:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OF_FILE
            if (r1 == r2) goto L25
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            if (r1 != r2) goto L11
        L25:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            if (r1 != r2) goto L2e
            goto L40
        L2e:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected a ')' but found '%s'."
            r1.<init>(r0, r2)
            throw r1
        L40:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = "EEE MMM dd yyyy HH:mm:ss z"
            r0.<init>(r2, r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    private long visitDateTimeExtendedJson() {
            r6 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r1)
            org.bson.json.JsonToken r1 = r6.popToken()
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.BEGIN_OBJECT
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L45
            org.bson.json.JsonToken r1 = r6.popToken()
            java.lang.Object r0 = r1.getValue(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "$numberLong"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L35
            java.lang.Long r0 = r6.visitNumberLongExtendedJson()
            long r0 = r0.longValue()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r2)
            goto L97
        L35:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            java.lang.String r0 = "JSON reader expected $numberLong within $date, but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L45:
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.INT32
            if (r2 == r3) goto L86
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.INT64
            if (r2 != r3) goto L56
            goto L86
        L56:
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.STRING
            if (r2 != r3) goto L76
            java.lang.Object r0 = r1.getValue(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = org.bson.json.DateTimeFormatter.parse(r0)     // Catch: java.lang.IllegalArgumentException -> L69
            goto L92
        L69:
            r0 = move-exception
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            java.lang.String r0 = "Failed to parse string as a date"
            r1.<init>(r0, r2)
            throw r1
        L76:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.getValue()
            r2[r4] = r1
            java.lang.String r1 = "JSON reader expected an integer or string but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L86:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Object r0 = r1.getValue(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L92:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r2)
        L97:
            return r0
    }

    private org.bson.BsonDbPointer visitDbPointerExtendedJson() {
            r5 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r5.verifyToken(r0)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_OBJECT
            r5.verifyToken(r1)
            java.lang.String r1 = r5.readStringFromExtendedJson()
            java.lang.String r2 = "$ref"
            boolean r3 = r1.equals(r2)
            java.lang.String r4 = "$id"
            if (r3 == 0) goto L31
            r5.verifyToken(r0)
            java.lang.String r0 = r5.readStringFromExtendedJson()
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA
            r5.verifyToken(r1)
            r5.verifyString(r4)
            org.bson.types.ObjectId r1 = r5.readDbPointerIdFromExtendedJson()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT
            r5.verifyToken(r2)
            goto L4a
        L31:
            boolean r3 = r1.equals(r4)
            if (r3 == 0) goto L55
            org.bson.types.ObjectId r1 = r5.readDbPointerIdFromExtendedJson()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA
            r5.verifyToken(r3)
            r5.verifyString(r2)
            r5.verifyToken(r0)
            java.lang.String r0 = r5.readStringFromExtendedJson()
        L4a:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT
            r5.verifyToken(r2)
            org.bson.BsonDbPointer r2 = new org.bson.BsonDbPointer
            r2.<init>(r0, r1)
            return r2
        L55:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r2 = "Expected $ref and $id fields in $dbPointer document but found "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private void visitEmptyConstructor() {
            r3 = this;
            org.bson.json.JsonToken r0 = r3.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.LEFT_PAREN
            if (r1 != r2) goto L12
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r3.verifyToken(r0)
            goto L15
        L12:
            r3.pushToken(r0)
        L15:
            return
    }

    private void visitExtendedJSON() {
            r4 = this;
            org.bson.json.JsonToken r0 = r4.popToken()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = r0.getValue(r1)
            java.lang.String r1 = (java.lang.String) r1
            org.bson.json.JsonTokenType r2 = r0.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.STRING
            if (r2 == r3) goto L18
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.UNQUOTED_STRING
            if (r2 != r3) goto L16c
        L18:
            java.lang.String r2 = "$binary"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L15e
            java.lang.String r2 = "$type"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2a
            goto L15e
        L2a:
            java.lang.String r2 = "$regex"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L150
            java.lang.String r2 = "$options"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3c
            goto L150
        L3c:
            java.lang.String r2 = "$code"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L48
            r4.visitJavaScriptExtendedJson()
            return
        L48:
            java.lang.String r2 = "$date"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L60
            long r0 = r4.visitDateTimeExtendedJson()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            r4.setCurrentBsonType(r0)
            return
        L60:
            java.lang.String r2 = "$maxKey"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L74
            org.bson.types.MaxKey r0 = r4.visitMaxKeyExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.MAX_KEY
            r4.setCurrentBsonType(r0)
            return
        L74:
            java.lang.String r2 = "$minKey"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L88
            org.bson.types.MinKey r0 = r4.visitMinKeyExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.MIN_KEY
            r4.setCurrentBsonType(r0)
            return
        L88:
            java.lang.String r2 = "$oid"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L9c
            org.bson.types.ObjectId r0 = r4.visitObjectIdExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            r4.setCurrentBsonType(r0)
            return
        L9c:
            java.lang.String r2 = "$regularExpression"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lb0
            org.bson.BsonRegularExpression r0 = r4.visitNewRegularExpressionExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r4.setCurrentBsonType(r0)
            return
        Lb0:
            java.lang.String r2 = "$symbol"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lc4
            java.lang.String r0 = r4.visitSymbolExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.SYMBOL
            r4.setCurrentBsonType(r0)
            return
        Lc4:
            java.lang.String r2 = "$timestamp"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Ld8
            org.bson.BsonTimestamp r0 = r4.visitTimestampExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.TIMESTAMP
            r4.setCurrentBsonType(r0)
            return
        Ld8:
            java.lang.String r2 = "$undefined"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lec
            org.bson.BsonUndefined r0 = r4.visitUndefinedExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.UNDEFINED
            r4.setCurrentBsonType(r0)
            return
        Lec:
            java.lang.String r2 = "$numberLong"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L100
            java.lang.Long r0 = r4.visitNumberLongExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            r4.setCurrentBsonType(r0)
            return
        L100:
            java.lang.String r2 = "$numberInt"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L114
            java.lang.Integer r0 = r4.visitNumberIntExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            r4.setCurrentBsonType(r0)
            return
        L114:
            java.lang.String r2 = "$numberDouble"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L128
            java.lang.Double r0 = r4.visitNumberDoubleExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r4.setCurrentBsonType(r0)
            return
        L128:
            java.lang.String r2 = "$numberDecimal"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L13c
            org.bson.types.Decimal128 r0 = r4.visitNumberDecimalExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            r4.setCurrentBsonType(r0)
            return
        L13c:
            java.lang.String r2 = "$dbPointer"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L16c
            org.bson.BsonDbPointer r0 = r4.visitDbPointerExtendedJson()
            r4.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            r4.setCurrentBsonType(r0)
            return
        L150:
            org.bson.BsonRegularExpression r1 = r4.visitRegularExpressionExtendedJson(r1)
            r4.currentValue = r1
            if (r1 == 0) goto L16c
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r4.setCurrentBsonType(r0)
            return
        L15e:
            org.bson.BsonBinary r1 = r4.visitBinDataExtendedJson(r1)
            r4.currentValue = r1
            if (r1 == 0) goto L16c
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r4.setCurrentBsonType(r0)
            return
        L16c:
            r4.pushToken(r0)
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            r4.setCurrentBsonType(r0)
            return
    }

    private org.bson.BsonBinary visitHexDataConstructor() {
            r8 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r8.verifyToken(r0)
            org.bson.json.JsonToken r0 = r8.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L60
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA
            r8.verifyToken(r1)
            java.lang.String r1 = r8.readStringFromExtendedJson()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r8.verifyToken(r2)
            int r2 = r1.length()
            r2 = r2 & r4
            if (r2 == 0) goto L2e
            java.lang.String r2 = "0"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
        L2e:
            org.bson.BsonBinarySubType[] r2 = org.bson.BsonBinarySubType.values()
            int r4 = r2.length
        L33:
            if (r3 >= r4) goto L56
            r5 = r2[r3]
            byte r6 = r5.getValue()
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Object r7 = r0.getValue(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 != r7) goto L53
            org.bson.BsonBinary r0 = new org.bson.BsonBinary
            byte[] r1 = decodeHex(r1)
            r0.<init>(r5, r1)
            return r0
        L53:
            int r3 = r3 + 1
            goto L33
        L56:
            org.bson.BsonBinary r0 = new org.bson.BsonBinary
            byte[] r1 = decodeHex(r1)
            r0.<init>(r1)
            return r0
        L60:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected a binary subtype but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    private long visitISODateTimeConstructor() {
            r11 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r11.verifyToken(r0)
            org.bson.json.JsonToken r0 = r11.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            if (r1 != r2) goto L1b
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            return r0
        L1b:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.STRING
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L99
            r11.verifyToken(r2)
            r1 = 3
            java.lang.String r2 = "yyyy-MM-dd"
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssz"
            java.lang.String r6 = "yyyy-MM-dd'T'HH:mm:ss.SSSz"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r6}
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r6 = r2[r5]
            java.util.Locale r7 = java.util.Locale.ENGLISH
            r3.<init>(r6, r7)
            java.text.ParsePosition r6 = new java.text.ParsePosition
            r6.<init>(r5)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "Z"
            boolean r7 = r0.endsWith(r7)
            if (r7 == 0) goto L6b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r0.length()
            int r8 = r8 - r4
            java.lang.String r0 = r0.substring(r5, r8)
            r7.append(r0)
            java.lang.String r0 = "GMT-00:00"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L6b:
            r7 = 0
        L6c:
            if (r7 >= r1) goto L91
            r8 = r2[r7]
            r3.applyPattern(r8)
            r3.setLenient(r4)
            r6.setIndex(r5)
            java.util.Date r8 = r3.parse(r0, r6)
            if (r8 == 0) goto L8e
            int r9 = r6.getIndex()
            int r10 = r0.length()
            if (r9 != r10) goto L8e
            long r0 = r8.getTime()
            return r0
        L8e:
            int r7 = r7 + 1
            goto L6c
        L91:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r1 = "Invalid date format."
            r0.<init>(r1)
            throw r0
        L99:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r0 = r0.getValue()
            r2[r5] = r0
            java.lang.String r0 = "JSON reader expected a string but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    private void visitJavaScriptExtendedJson() {
            r5 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r5.verifyToken(r0)
            java.lang.String r1 = r5.readStringFromExtendedJson()
            org.bson.json.JsonToken r2 = r5.popToken()
            int[] r3 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType
            org.bson.json.JsonTokenType r4 = r2.getType()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 3
            if (r3 == r4) goto L51
            r4 = 11
            if (r3 != r4) goto L43
            java.lang.String r2 = "$scope"
            r5.verifyString(r2)
            r5.verifyToken(r0)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r5.setState(r0)
            r5.currentValue = r1
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            r5.setCurrentBsonType(r0)
            org.bson.json.JsonReader$Context r0 = new org.bson.json.JsonReader$Context
            org.bson.json.JsonReader$Context r1 = r5.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.SCOPE_DOCUMENT
            r0.<init>(r5, r1, r2)
            r5.setContext(r0)
            goto L58
        L43:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "JSON reader expected ',' or '}' but found '%s'."
            r0.<init>(r2, r1)
            throw r0
        L51:
            r5.currentValue = r1
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT
            r5.setCurrentBsonType(r0)
        L58:
            return
    }

    private org.bson.BsonBinary visitLegacyBinaryExtendedJson(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "$binary"
            org.bson.json.JsonReader$Mark r1 = new org.bson.json.JsonReader$Mark
            r1.<init>(r6)
            r2 = 0
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COLON     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyToken(r3)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            if (r7 == 0) goto L2d
            java.lang.String r7 = r6.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            byte[] r7 = org.bson.internal.Base64.decode(r7)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyToken(r0)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            java.lang.String r0 = "$type"
            r6.verifyString(r0)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyToken(r3)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            byte r0 = r6.readBinarySubtypeFromExtendedJson()     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            goto L47
        L2d:
            byte r7 = r6.readBinarySubtypeFromExtendedJson()     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyToken(r4)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyString(r0)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyToken(r3)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            java.lang.String r0 = r6.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            byte[] r0 = org.bson.internal.Base64.decode(r0)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r5 = r0
            r0 = r7
            r7 = r5
        L47:
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.END_OBJECT     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r6.verifyToken(r3)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            org.bson.BsonBinary r3 = new org.bson.BsonBinary     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r3.<init>(r0, r7)     // Catch: java.lang.Throwable -> L55 java.lang.NumberFormatException -> L57 org.bson.json.JsonParseException -> L5e
            r1.discard()
            return r3
        L55:
            r7 = move-exception
            goto L65
        L57:
            r1.reset()     // Catch: java.lang.Throwable -> L55
            r1.discard()
            return r2
        L5e:
            r1.reset()     // Catch: java.lang.Throwable -> L55
            r1.discard()
            return r2
        L65:
            r1.discard()
            throw r7
    }

    private org.bson.types.MaxKey visitMaxKeyExtendedJson() {
            r2 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r2.verifyToken(r0)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.INT32
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.verifyToken(r0, r1)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.END_OBJECT
            r2.verifyToken(r0)
            org.bson.types.MaxKey r0 = new org.bson.types.MaxKey
            r0.<init>()
            return r0
    }

    private org.bson.types.MinKey visitMinKeyExtendedJson() {
            r2 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r2.verifyToken(r0)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.INT32
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.verifyToken(r0, r1)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.END_OBJECT
            r2.verifyToken(r0)
            org.bson.types.MinKey r0 = new org.bson.types.MinKey
            r0.<init>()
            return r0
    }

    private void visitNew() {
            r6 = this;
            org.bson.json.JsonToken r0 = r6.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.UNQUOTED_STRING
            r3 = 0
            r4 = 1
            java.lang.String r5 = "JSON reader expected a type name but found '%s'."
            if (r1 != r2) goto L181
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "MinKey"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L31
            r6.visitEmptyConstructor()
            org.bson.BsonType r0 = org.bson.BsonType.MIN_KEY
            r6.setCurrentBsonType(r0)
            org.bson.types.MinKey r0 = new org.bson.types.MinKey
            r0.<init>()
            r6.currentValue = r0
            goto L180
        L31:
            java.lang.String r1 = "MaxKey"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4a
            r6.visitEmptyConstructor()
            org.bson.BsonType r0 = org.bson.BsonType.MAX_KEY
            r6.setCurrentBsonType(r0)
            org.bson.types.MaxKey r0 = new org.bson.types.MaxKey
            r0.<init>()
            r6.currentValue = r0
            goto L180
        L4a:
            java.lang.String r1 = "BinData"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5f
            org.bson.BsonBinary r0 = r6.visitBinDataConstructor()
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r6.setCurrentBsonType(r0)
            goto L180
        L5f:
            java.lang.String r1 = "Date"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L78
            long r0 = r6.visitDateTimeConstructor()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            r6.setCurrentBsonType(r0)
            goto L180
        L78:
            java.lang.String r1 = "HexData"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L8d
            org.bson.BsonBinary r0 = r6.visitHexDataConstructor()
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r6.setCurrentBsonType(r0)
            goto L180
        L8d:
            java.lang.String r1 = "ISODate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto La6
            long r0 = r6.visitISODateTimeConstructor()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            r6.setCurrentBsonType(r0)
            goto L180
        La6:
            java.lang.String r1 = "NumberInt"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lbf
            int r0 = r6.visitNumberIntConstructor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            r6.setCurrentBsonType(r0)
            goto L180
        Lbf:
            java.lang.String r1 = "NumberLong"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ld8
            long r0 = r6.visitNumberLongConstructor()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            r6.setCurrentBsonType(r0)
            goto L180
        Ld8:
            java.lang.String r1 = "NumberDecimal"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Led
            org.bson.types.Decimal128 r0 = r6.visitNumberDecimalConstructor()
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            r6.setCurrentBsonType(r0)
            goto L180
        Led:
            java.lang.String r1 = "ObjectId"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L102
            org.bson.types.ObjectId r0 = r6.visitObjectIdConstructor()
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            r6.setCurrentBsonType(r0)
            goto L180
        L102:
            java.lang.String r1 = "RegExp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L116
            org.bson.BsonRegularExpression r0 = r6.visitRegularExpressionConstructor()
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r6.setCurrentBsonType(r0)
            goto L180
        L116:
            java.lang.String r1 = "DBPointer"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12a
            org.bson.BsonDbPointer r0 = r6.visitDBPointerConstructor()
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            r6.setCurrentBsonType(r0)
            goto L180
        L12a:
            java.lang.String r1 = "UUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "GUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "CSUUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "CSGUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "JUUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "JGUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "PYUUID"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L175
            java.lang.String r1 = "PYGUID"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16b
            goto L175
        L16b:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            r1.<init>(r5, r2)
            throw r1
        L175:
            org.bson.BsonBinary r0 = r6.visitUUIDConstructor(r0)
            r6.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r6.setCurrentBsonType(r0)
        L180:
            return
        L181:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            r1.<init>(r5, r2)
            throw r1
    }

    private org.bson.BsonRegularExpression visitNewRegularExpressionExtendedJson() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r0)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_OBJECT
            r6.verifyToken(r1)
            java.lang.String r1 = r6.readStringFromExtendedJson()
            java.lang.String r2 = "pattern"
            boolean r3 = r1.equals(r2)
            java.lang.String r4 = "options"
            if (r3 == 0) goto L2f
            r6.verifyToken(r0)
            java.lang.String r1 = r6.readStringFromExtendedJson()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COMMA
            r6.verifyToken(r2)
            r6.verifyString(r4)
            r6.verifyToken(r0)
            java.lang.String r0 = r6.readStringFromExtendedJson()
            goto L4e
        L2f:
            boolean r3 = r1.equals(r4)
            if (r3 == 0) goto L5c
            r6.verifyToken(r0)
            java.lang.String r1 = r6.readStringFromExtendedJson()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA
            r6.verifyToken(r3)
            r6.verifyString(r2)
            r6.verifyToken(r0)
            java.lang.String r0 = r6.readStringFromExtendedJson()
            r5 = r1
            r1 = r0
            r0 = r5
        L4e:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r2)
            r6.verifyToken(r2)
            org.bson.BsonRegularExpression r2 = new org.bson.BsonRegularExpression
            r2.<init>(r1, r0)
            return r2
        L5c:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r2 = "Expected 't' and 'i' fields in $timestamp document but found "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private org.bson.types.Decimal128 visitNumberDecimalConstructor() {
            r4 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r4.verifyToken(r0)
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            if (r1 == r2) goto L49
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT64
            if (r1 == r2) goto L49
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.DOUBLE
            if (r1 != r2) goto L22
            goto L49
        L22:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.STRING
            if (r1 != r2) goto L37
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.parse(r0)
            goto L51
        L37:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected a number or a string but found '%s'."
            r1.<init>(r0, r2)
            throw r1
        L49:
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            java.lang.Object r0 = r0.getValue(r1)
            org.bson.types.Decimal128 r0 = (org.bson.types.Decimal128) r0
        L51:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r4.verifyToken(r1)
            return r0
    }

    private org.bson.types.Decimal128 visitNumberDecimalExtendedJson() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r0)
            java.lang.String r0 = r6.readStringFromExtendedJson()
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.parse(r0)     // Catch: java.lang.NumberFormatException -> L13
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r1)
            return r0
        L13:
            r1 = move-exception
            org.bson.json.JsonParseException r2 = new org.bson.json.JsonParseException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            java.lang.String r0 = r0.getName()
            r5 = 1
            r3[r5] = r0
            java.lang.String r0 = "Exception converting value '%s' to type %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r1
            r2.<init>(r0, r3)
            throw r2
    }

    private java.lang.Double visitNumberDoubleExtendedJson() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r0)
            java.lang.String r0 = r6.readStringFromExtendedJson()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L13
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r1)
            return r0
        L13:
            r1 = move-exception
            org.bson.json.JsonParseException r2 = new org.bson.json.JsonParseException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            java.lang.String r0 = r0.getName()
            r5 = 1
            r3[r5] = r0
            java.lang.String r0 = "Exception converting value '%s' to type %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r1
            r2.<init>(r0, r3)
            throw r2
    }

    private int visitNumberIntConstructor() {
            r4 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r4.verifyToken(r0)
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            if (r1 != r2) goto L1e
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L32
        L1e:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.STRING
            if (r1 != r2) goto L38
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
        L32:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r4.verifyToken(r1)
            return r0
        L38:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected an integer or a string but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    private java.lang.Integer visitNumberIntExtendedJson() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r0)
            java.lang.String r0 = r6.readStringFromExtendedJson()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L13
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r1)
            return r0
        L13:
            r1 = move-exception
            org.bson.json.JsonParseException r2 = new org.bson.json.JsonParseException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.String r0 = r0.getName()
            r5 = 1
            r3[r5] = r0
            java.lang.String r0 = "Exception converting value '%s' to type %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r1
            r2.<init>(r0, r3)
            throw r2
    }

    private long visitNumberLongConstructor() {
            r4 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r4.verifyToken(r0)
            org.bson.json.JsonToken r0 = r4.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT32
            if (r1 == r2) goto L41
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.INT64
            if (r1 != r2) goto L1a
            goto L41
        L1a:
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.STRING
            if (r1 != r2) goto L2f
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            goto L4d
        L2f:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader expected an integer or a string but found '%s'."
            r1.<init>(r0, r2)
            throw r1
        L41:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Object r0 = r0.getValue(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L4d:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r4.verifyToken(r2)
            return r0
    }

    private java.lang.Long visitNumberLongExtendedJson() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r0)
            java.lang.String r0 = r6.readStringFromExtendedJson()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L13
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r1)
            return r0
        L13:
            r1 = move-exception
            org.bson.json.JsonParseException r2 = new org.bson.json.JsonParseException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.String r0 = r0.getName()
            r5 = 1
            r3[r5] = r0
            java.lang.String r0 = "Exception converting value '%s' to type %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r1
            r2.<init>(r0, r3)
            throw r2
    }

    private org.bson.types.ObjectId visitObjectIdConstructor() {
            r2 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r2.verifyToken(r0)
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            java.lang.String r1 = r2.readStringFromExtendedJson()
            r0.<init>(r1)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r2.verifyToken(r1)
            return r0
    }

    private org.bson.types.ObjectId visitObjectIdExtendedJson() {
            r2 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r2.verifyToken(r0)
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            java.lang.String r1 = r2.readStringFromExtendedJson()
            r0.<init>(r1)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            r2.verifyToken(r1)
            return r0
    }

    private org.bson.BsonRegularExpression visitRegularExpressionConstructor() {
            r4 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r4.verifyToken(r0)
            java.lang.String r0 = r4.readStringFromExtendedJson()
            org.bson.json.JsonToken r1 = r4.popToken()
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA
            if (r2 != r3) goto L1a
            java.lang.String r1 = r4.readStringFromExtendedJson()
            goto L1f
        L1a:
            r4.pushToken(r1)
            java.lang.String r1 = ""
        L1f:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r4.verifyToken(r2)
            org.bson.BsonRegularExpression r2 = new org.bson.BsonRegularExpression
            r2.<init>(r0, r1)
            return r2
    }

    private org.bson.BsonRegularExpression visitRegularExpressionExtendedJson(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "$regex"
            org.bson.json.JsonReader$Mark r1 = new org.bson.json.JsonReader$Mark
            r1.<init>(r5)
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COLON     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyToken(r2)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            if (r6 == 0) goto L28
            java.lang.String r6 = r5.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyToken(r0)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            java.lang.String r0 = "$options"
            r5.verifyString(r0)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyToken(r2)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            java.lang.String r0 = r5.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            goto L3e
        L28:
            java.lang.String r6 = r5.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyToken(r3)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyString(r0)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyToken(r2)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            java.lang.String r0 = r5.readStringFromExtendedJson()     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r4 = r0
            r0 = r6
            r6 = r4
        L3e:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r5.verifyToken(r2)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            org.bson.BsonRegularExpression r2 = new org.bson.BsonRegularExpression     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> L4c org.bson.json.JsonParseException -> L4e
            r1.discard()
            return r2
        L4c:
            r6 = move-exception
            goto L56
        L4e:
            r1.reset()     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            r1.discard()
            return r6
        L56:
            r1.discard()
            throw r6
    }

    private java.lang.String visitSymbolExtendedJson() {
            r2 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r2.verifyToken(r0)
            java.lang.String r0 = r2.readStringFromExtendedJson()
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            r2.verifyToken(r1)
            return r0
    }

    private org.bson.BsonTimestamp visitTimestampConstructor() {
            r9 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.LEFT_PAREN
            r9.verifyToken(r1)
            org.bson.json.JsonToken r1 = r9.popToken()
            org.bson.json.JsonTokenType r2 = r1.getType()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.INT32
            r4 = 0
            r5 = 1
            java.lang.String r6 = "JSON reader expected an integer but found '%s'."
            if (r2 != r3) goto L53
            java.lang.Object r2 = r1.getValue(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            org.bson.json.JsonTokenType r7 = org.bson.json.JsonTokenType.COMMA
            r9.verifyToken(r7)
            org.bson.json.JsonToken r7 = r9.popToken()
            org.bson.json.JsonTokenType r8 = r7.getType()
            if (r8 != r3) goto L45
            java.lang.Object r0 = r7.getValue(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r9.verifyToken(r1)
            org.bson.BsonTimestamp r1 = new org.bson.BsonTimestamp
            r1.<init>(r2, r0)
            return r1
        L45:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.getValue()
            r2[r4] = r1
            r0.<init>(r6, r2)
            throw r0
        L53:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.getValue()
            r2[r4] = r1
            r0.<init>(r6, r2)
            throw r0
    }

    private org.bson.BsonTimestamp visitTimestampExtendedJson() {
            r6 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r6.verifyToken(r0)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_OBJECT
            r6.verifyToken(r1)
            java.lang.String r1 = r6.readStringFromExtendedJson()
            java.lang.String r2 = "t"
            boolean r3 = r1.equals(r2)
            java.lang.String r4 = "i"
            if (r3 == 0) goto L2f
            r6.verifyToken(r0)
            int r1 = r6.readIntFromExtendedJson()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COMMA
            r6.verifyToken(r2)
            r6.verifyString(r4)
            r6.verifyToken(r0)
            int r0 = r6.readIntFromExtendedJson()
            goto L4e
        L2f:
            boolean r3 = r1.equals(r4)
            if (r3 == 0) goto L5c
            r6.verifyToken(r0)
            int r1 = r6.readIntFromExtendedJson()
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA
            r6.verifyToken(r3)
            r6.verifyString(r2)
            r6.verifyToken(r0)
            int r0 = r6.readIntFromExtendedJson()
            r5 = r1
            r1 = r0
            r0 = r5
        L4e:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT
            r6.verifyToken(r2)
            r6.verifyToken(r2)
            org.bson.BsonTimestamp r2 = new org.bson.BsonTimestamp
            r2.<init>(r1, r0)
            return r2
        L5c:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r2 = "Expected 't' and 'i' fields in $timestamp document but found "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private org.bson.BsonBinary visitUUIDConstructor(java.lang.String r4) {
            r3 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.LEFT_PAREN
            r3.verifyToken(r0)
            java.lang.String r0 = r3.readStringFromExtendedJson()
            java.lang.String r1 = "\\{"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r1 = "}"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r1 = "-"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.RIGHT_PAREN
            r3.verifyToken(r1)
            byte[] r0 = decodeHex(r0)
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_STANDARD
            java.lang.String r2 = "UUID"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L38
            java.lang.String r2 = "GUID"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L3a
        L38:
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_LEGACY
        L3a:
            org.bson.BsonBinary r4 = new org.bson.BsonBinary
            r4.<init>(r1, r0)
            return r4
    }

    private org.bson.BsonUndefined visitUndefinedExtendedJson() {
            r4 = this;
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COLON
            r4.verifyToken(r0)
            org.bson.json.JsonToken r0 = r4.popToken()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = r0.getValue(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L24
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.END_OBJECT
            r4.verifyToken(r0)
            org.bson.BsonUndefined r0 = new org.bson.BsonUndefined
            r0.<init>()
            return r0
        L24:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r0 = r0.getValue()
            r2[r3] = r0
            java.lang.String r0 = "JSON reader requires $undefined to have the value of true but found '%s'."
            r1.<init>(r0, r2)
            throw r1
    }

    @Override // org.bson.AbstractBsonReader
    public final int doPeekBinarySize() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.BsonBinary r0 = (org.bson.BsonBinary) r0
            byte[] r0 = r0.getData()
            int r0 = r0.length
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final byte doPeekBinarySubType() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.BsonBinary r0 = (org.bson.BsonBinary) r0
            byte r0 = r0.getType()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonBinary doReadBinaryData() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.BsonBinary r0 = (org.bson.BsonBinary) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final boolean doReadBoolean() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonDbPointer doReadDBPointer() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.BsonDbPointer r0 = (org.bson.BsonDbPointer) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final long doReadDateTime() {
            r2 = this;
            java.lang.Object r0 = r2.currentValue
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public org.bson.types.Decimal128 doReadDecimal128() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.types.Decimal128 r0 = (org.bson.types.Decimal128) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final double doReadDouble() {
            r2 = this;
            java.lang.Object r0 = r2.currentValue
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadEndArray() {
            r3 = this;
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.json.JsonReader$Context r0 = r0.getParentContext()
            r3.setContext(r0)
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY
            if (r0 == r1) goto L23
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT
            if (r0 != r1) goto L32
        L23:
            org.bson.json.JsonToken r0 = r3.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COMMA
            if (r1 == r2) goto L32
            r3.pushToken(r0)
        L32:
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadEndDocument() {
            r3 = this;
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.json.JsonReader$Context r0 = r0.getParentContext()
            r3.setContext(r0)
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            if (r0 == 0) goto L2d
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT
            if (r0 != r1) goto L2d
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.json.JsonReader$Context r0 = r0.getParentContext()
            r3.setContext(r0)
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.END_OBJECT
            r3.verifyToken(r0)
        L2d:
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            if (r0 == 0) goto L5b
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY
            if (r0 == r1) goto L4b
            org.bson.json.JsonReader$Context r0 = r3.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT
            if (r0 != r1) goto L5a
        L4b:
            org.bson.json.JsonToken r0 = r3.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COMMA
            if (r1 == r2) goto L5a
            r3.pushToken(r0)
        L5a:
            return
        L5b:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r1 = "Unexpected end of document."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.AbstractBsonReader
    public final int doReadInt32() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final long doReadInt64() {
            r2 = this;
            java.lang.Object r0 = r2.currentValue
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadJavaScript() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadJavaScriptWithScope() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            java.lang.String r0 = (java.lang.String) r0
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
            java.lang.Object r0 = r1.currentValue
            org.bson.types.ObjectId r0 = (org.bson.types.ObjectId) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonRegularExpression doReadRegularExpression() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.BsonRegularExpression r0 = (org.bson.BsonRegularExpression) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadStartArray() {
            r3 = this;
            org.bson.json.JsonReader$Context r0 = new org.bson.json.JsonReader$Context
            org.bson.json.JsonReader$Context r1 = r3.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.ARRAY
            r0.<init>(r3, r1, r2)
            r3.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadStartDocument() {
            r3 = this;
            org.bson.json.JsonReader$Context r0 = new org.bson.json.JsonReader$Context
            org.bson.json.JsonReader$Context r1 = r3.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.DOCUMENT
            r0.<init>(r3, r1, r2)
            r3.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadString() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadSymbol() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonTimestamp doReadTimestamp() {
            r1 = this;
            java.lang.Object r0 = r1.currentValue
            org.bson.BsonTimestamp r0 = (org.bson.BsonTimestamp) r0
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
            r2 = this;
            int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonType
            org.bson.BsonType r1 = r2.getCurrentBsonType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L8d;
                case 2: goto L89;
                case 3: goto L85;
                case 4: goto L81;
                case 5: goto L6b;
                case 6: goto L67;
                case 7: goto L63;
                case 8: goto L5f;
                case 9: goto L5b;
                case 10: goto L57;
                case 11: goto L3e;
                case 12: goto L39;
                case 13: goto L34;
                case 14: goto L2f;
                case 15: goto L2a;
                case 16: goto L25;
                case 17: goto L20;
                case 18: goto L1b;
                case 19: goto L16;
                case 20: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L9f
        L11:
            r2.readUndefined()
            goto L9f
        L16:
            r2.readTimestamp()
            goto L9f
        L1b:
            r2.readSymbol()
            goto L9f
        L20:
            r2.readString()
            goto L9f
        L25:
            r2.readRegularExpression()
            goto L9f
        L2a:
            r2.readObjectId()
            goto L9f
        L2f:
            r2.readNull()
            goto L9f
        L34:
            r2.readMinKey()
            goto L9f
        L39:
            r2.readMaxKey()
            goto L9f
        L3e:
            r2.readJavaScriptWithScope()
            r2.readStartDocument()
        L44:
            org.bson.BsonType r0 = r2.readBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            if (r0 == r1) goto L53
            r2.skipName()
            r2.skipValue()
            goto L44
        L53:
            r2.readEndDocument()
            goto L9f
        L57:
            r2.readJavaScript()
            goto L9f
        L5b:
            r2.readDecimal128()
            goto L9f
        L5f:
            r2.readInt64()
            goto L9f
        L63:
            r2.readInt32()
            goto L9f
        L67:
            r2.readDouble()
            goto L9f
        L6b:
            r2.readStartDocument()
        L6e:
            org.bson.BsonType r0 = r2.readBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            if (r0 == r1) goto L7d
            r2.skipName()
            r2.skipValue()
            goto L6e
        L7d:
            r2.readEndDocument()
            goto L9f
        L81:
            r2.readDateTime()
            goto L9f
        L85:
            r2.readBoolean()
            goto L9f
        L89:
            r2.readBinaryData()
            goto L9f
        L8d:
            r2.readStartArray()
        L90:
            org.bson.BsonType r0 = r2.readBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            if (r0 == r1) goto L9c
            r2.skipValue()
            goto L90
        L9c:
            r2.readEndArray()
        L9f:
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final /* bridge */ /* synthetic */ org.bson.AbstractBsonReader.Context getContext() {
            r1 = this;
            org.bson.json.JsonReader$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.json.JsonReader.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonReader$Context r0 = super.getContext()
            org.bson.json.JsonReader$Context r0 = (org.bson.json.JsonReader.Context) r0
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonReaderMark getMark() {
            r1 = this;
            org.bson.json.JsonReader$Mark r0 = new org.bson.json.JsonReader$Mark
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.BsonReader
    @java.lang.Deprecated
    public void mark() {
            r2 = this;
            org.bson.json.JsonReader$Mark r0 = r2.mark
            if (r0 != 0) goto Lc
            org.bson.json.JsonReader$Mark r0 = new org.bson.json.JsonReader$Mark
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
            r10 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r1 = r10.isClosed()
            if (r1 != 0) goto L370
            org.bson.AbstractBsonReader$State r1 = r10.getState()
            org.bson.AbstractBsonReader$State r2 = org.bson.AbstractBsonReader.State.INITIAL
            if (r1 == r2) goto L20
            org.bson.AbstractBsonReader$State r1 = r10.getState()
            org.bson.AbstractBsonReader$State r2 = org.bson.AbstractBsonReader.State.DONE
            if (r1 == r2) goto L20
            org.bson.AbstractBsonReader$State r1 = r10.getState()
            org.bson.AbstractBsonReader$State r2 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            if (r1 != r2) goto L25
        L20:
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            r10.setState(r1)
        L25:
            org.bson.AbstractBsonReader$State r1 = r10.getState()
            org.bson.AbstractBsonReader$State r2 = org.bson.AbstractBsonReader.State.TYPE
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L365
            org.bson.json.JsonReader$Context r1 = r10.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.DOCUMENT
            r5 = 3
            if (r1 != r2) goto L91
            org.bson.json.JsonToken r1 = r10.popToken()
            int[] r6 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType
            org.bson.json.JsonTokenType r7 = r1.getType()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            if (r6 == r4) goto L6b
            r7 = 2
            if (r6 == r7) goto L6b
            if (r6 != r5) goto L5b
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_DOCUMENT
            r10.setState(r0)
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            return r0
        L5b:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r1 = r1.getValue()
            r2[r3] = r1
            java.lang.String r1 = "JSON reader was expecting a name but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L6b:
            java.lang.Object r1 = r1.getValue(r0)
            java.lang.String r1 = (java.lang.String) r1
            r10.setCurrentName(r1)
            org.bson.json.JsonToken r1 = r10.popToken()
            org.bson.json.JsonTokenType r6 = r1.getType()
            org.bson.json.JsonTokenType r7 = org.bson.json.JsonTokenType.COLON
            if (r6 != r7) goto L81
            goto L91
        L81:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r1 = r1.getValue()
            r2[r3] = r1
            java.lang.String r1 = "JSON reader was expecting ':' but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L91:
            org.bson.json.JsonToken r1 = r10.popToken()
            org.bson.json.JsonReader$Context r6 = r10.getContext()
            org.bson.BsonContextType r6 = r6.getContextType()
            org.bson.BsonContextType r7 = org.bson.BsonContextType.ARRAY
            if (r6 != r7) goto Lb1
            org.bson.json.JsonTokenType r6 = r1.getType()
            org.bson.json.JsonTokenType r8 = org.bson.json.JsonTokenType.END_ARRAY
            if (r6 != r8) goto Lb1
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_ARRAY
            r10.setState(r0)
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            return r0
        Lb1:
            int[] r6 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$json$JsonTokenType
            org.bson.json.JsonTokenType r8 = r1.getType()
            int r8 = r8.ordinal()
            r6 = r6[r8]
            switch(r6) {
                case 1: goto L2fc;
                case 2: goto L10a;
                case 3: goto Lc0;
                case 4: goto L103;
                case 5: goto Lfe;
                case 6: goto Lf1;
                case 7: goto Lea;
                case 8: goto Ldd;
                case 9: goto Ld0;
                case 10: goto Lc3;
                default: goto Lc0;
            }
        Lc0:
            r0 = 1
            goto L308
        Lc3:
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r10.setCurrentBsonType(r0)
            java.lang.Object r0 = r1.getValue()
            r10.currentValue = r0
            goto L307
        Ld0:
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            r10.setCurrentBsonType(r0)
            java.lang.Object r0 = r1.getValue()
            r10.currentValue = r0
            goto L307
        Ldd:
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            r10.setCurrentBsonType(r0)
            java.lang.Object r0 = r1.getValue()
            r10.currentValue = r0
            goto L307
        Lea:
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            r10.setCurrentBsonType(r0)
            goto L307
        Lf1:
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r10.setCurrentBsonType(r0)
            java.lang.Object r0 = r1.getValue()
            r10.currentValue = r0
            goto L307
        Lfe:
            r10.visitExtendedJSON()
            goto L307
        L103:
            org.bson.BsonType r0 = org.bson.BsonType.ARRAY
            r10.setCurrentBsonType(r0)
            goto L307
        L10a:
            java.lang.Object r0 = r1.getValue(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "false"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2ec
            java.lang.String r6 = "true"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L122
            goto L2ec
        L122:
            java.lang.String r6 = "Infinity"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L139
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r10.setCurrentBsonType(r0)
            r8 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            r10.currentValue = r0
            goto L307
        L139:
            java.lang.String r6 = "NaN"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L150
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r10.setCurrentBsonType(r0)
            r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            r10.currentValue = r0
            goto L307
        L150:
            java.lang.String r6 = "null"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L15f
            org.bson.BsonType r0 = org.bson.BsonType.NULL
            r10.setCurrentBsonType(r0)
            goto L307
        L15f:
            java.lang.String r6 = "undefined"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L16e
            org.bson.BsonType r0 = org.bson.BsonType.UNDEFINED
            r10.setCurrentBsonType(r0)
            goto L307
        L16e:
            java.lang.String r6 = "MinKey"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L187
            r10.visitEmptyConstructor()
            org.bson.BsonType r0 = org.bson.BsonType.MIN_KEY
            r10.setCurrentBsonType(r0)
            org.bson.types.MinKey r0 = new org.bson.types.MinKey
            r0.<init>()
            r10.currentValue = r0
            goto L307
        L187:
            java.lang.String r6 = "MaxKey"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L1a0
            r10.visitEmptyConstructor()
            org.bson.BsonType r0 = org.bson.BsonType.MAX_KEY
            r10.setCurrentBsonType(r0)
            org.bson.types.MaxKey r0 = new org.bson.types.MaxKey
            r0.<init>()
            r10.currentValue = r0
            goto L307
        L1a0:
            java.lang.String r6 = "BinData"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L1b5
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r10.setCurrentBsonType(r0)
            org.bson.BsonBinary r0 = r10.visitBinDataConstructor()
            r10.currentValue = r0
            goto L307
        L1b5:
            java.lang.String r6 = "Date"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L1ca
            java.lang.String r0 = r10.visitDateTimeConstructorWithOutNew()
            r10.currentValue = r0
            org.bson.BsonType r0 = org.bson.BsonType.STRING
            r10.setCurrentBsonType(r0)
            goto L307
        L1ca:
            java.lang.String r6 = "HexData"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L1df
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r10.setCurrentBsonType(r0)
            org.bson.BsonBinary r0 = r10.visitHexDataConstructor()
            r10.currentValue = r0
            goto L307
        L1df:
            java.lang.String r6 = "ISODate"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L1f8
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            r10.setCurrentBsonType(r0)
            long r8 = r10.visitISODateTimeConstructor()
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r10.currentValue = r0
            goto L307
        L1f8:
            java.lang.String r6 = "NumberInt"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L211
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            r10.setCurrentBsonType(r0)
            int r0 = r10.visitNumberIntConstructor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.currentValue = r0
            goto L307
        L211:
            java.lang.String r6 = "NumberLong"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L22a
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            r10.setCurrentBsonType(r0)
            long r8 = r10.visitNumberLongConstructor()
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r10.currentValue = r0
            goto L307
        L22a:
            java.lang.String r6 = "NumberDecimal"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L23f
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            r10.setCurrentBsonType(r0)
            org.bson.types.Decimal128 r0 = r10.visitNumberDecimalConstructor()
            r10.currentValue = r0
            goto L307
        L23f:
            java.lang.String r6 = "ObjectId"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L254
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            r10.setCurrentBsonType(r0)
            org.bson.types.ObjectId r0 = r10.visitObjectIdConstructor()
            r10.currentValue = r0
            goto L307
        L254:
            java.lang.String r6 = "Timestamp"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L269
            org.bson.BsonType r0 = org.bson.BsonType.TIMESTAMP
            r10.setCurrentBsonType(r0)
            org.bson.BsonTimestamp r0 = r10.visitTimestampConstructor()
            r10.currentValue = r0
            goto L307
        L269:
            java.lang.String r6 = "RegExp"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L27e
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r10.setCurrentBsonType(r0)
            org.bson.BsonRegularExpression r0 = r10.visitRegularExpressionConstructor()
            r10.currentValue = r0
            goto L307
        L27e:
            java.lang.String r6 = "DBPointer"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L293
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            r10.setCurrentBsonType(r0)
            org.bson.BsonDbPointer r0 = r10.visitDBPointerConstructor()
            r10.currentValue = r0
            goto L307
        L293:
            java.lang.String r6 = "UUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "GUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "CSUUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "CSGUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "JUUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "JGUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "PYUUID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e0
            java.lang.String r6 = "PYGUID"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L2d4
            goto L2e0
        L2d4:
            java.lang.String r6 = "new"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lc0
            r10.visitNew()
            goto L307
        L2e0:
            org.bson.BsonType r6 = org.bson.BsonType.BINARY
            r10.setCurrentBsonType(r6)
            org.bson.BsonBinary r0 = r10.visitUUIDConstructor(r0)
            r10.currentValue = r0
            goto L307
        L2ec:
            org.bson.BsonType r6 = org.bson.BsonType.BOOLEAN
            r10.setCurrentBsonType(r6)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.currentValue = r0
            goto L307
        L2fc:
            org.bson.BsonType r0 = org.bson.BsonType.STRING
            r10.setCurrentBsonType(r0)
            java.lang.Object r0 = r1.getValue()
            r10.currentValue = r0
        L307:
            r0 = 0
        L308:
            if (r0 != 0) goto L355
            org.bson.json.JsonReader$Context r0 = r10.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            if (r0 == r7) goto L31e
            org.bson.json.JsonReader$Context r0 = r10.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            if (r0 != r2) goto L32d
        L31e:
            org.bson.json.JsonToken r0 = r10.popToken()
            org.bson.json.JsonTokenType r1 = r0.getType()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COMMA
            if (r1 == r2) goto L32d
            r10.pushToken(r0)
        L32d:
            int[] r0 = org.bson.json.JsonReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.json.JsonReader$Context r1 = r10.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L34b
            r1 = 4
            if (r0 == r1) goto L34b
            r1 = 5
            if (r0 == r1) goto L34b
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.NAME
            r10.setState(r0)
            goto L350
        L34b:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r10.setState(r0)
        L350:
            org.bson.BsonType r0 = r10.getCurrentBsonType()
            return r0
        L355:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r1 = r1.getValue()
            r2[r3] = r1
            java.lang.String r1 = "JSON reader was expecting a value but found '%s'."
            r0.<init>(r1, r2)
            throw r0
        L365:
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r4]
            r0[r3] = r2
            java.lang.String r1 = "readBSONType"
            r10.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
        L370:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This instance has been closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonReader
    @java.lang.Deprecated
    public void reset() {
            r2 = this;
            org.bson.json.JsonReader$Mark r0 = r2.mark
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
