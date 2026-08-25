package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class CLParser {
    private boolean hasComment;
    private int lineNumber;
    private java.lang.String mContent;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.CLParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = null;

        static {
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum TYPE extends java.lang.Enum<androidx.constraintlayout.core.parser.CLParser.TYPE> {
        private static final /* synthetic */ androidx.constraintlayout.core.parser.CLParser.TYPE[] $VALUES = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE ARRAY = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE KEY = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE NUMBER = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE OBJECT = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE STRING = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE TOKEN = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE UNKNOWN = null;

        static {
                androidx.constraintlayout.core.parser.CLParser$TYPE r0 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.parser.CLParser.TYPE.UNKNOWN = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r3 = "OBJECT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT = r1
                androidx.constraintlayout.core.parser.CLParser$TYPE r3 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r5 = "ARRAY"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY = r3
                androidx.constraintlayout.core.parser.CLParser$TYPE r5 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r7 = "NUMBER"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER = r5
                androidx.constraintlayout.core.parser.CLParser$TYPE r7 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r9 = "STRING"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.core.parser.CLParser.TYPE.STRING = r7
                androidx.constraintlayout.core.parser.CLParser$TYPE r9 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r11 = "KEY"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.core.parser.CLParser.TYPE.KEY = r9
                androidx.constraintlayout.core.parser.CLParser$TYPE r11 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r13 = "TOKEN"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN = r11
                r13 = 7
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r13 = new androidx.constraintlayout.core.parser.CLParser.TYPE[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.constraintlayout.core.parser.CLParser.TYPE.$VALUES = r13
                return
        }

        private TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.parser.CLParser.TYPE valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.parser.CLParser$TYPE> r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = (androidx.constraintlayout.core.parser.CLParser.TYPE) r1
                return r1
        }

        public static androidx.constraintlayout.core.parser.CLParser.TYPE[] values() {
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = (androidx.constraintlayout.core.parser.CLParser.TYPE[]) r0
                return r0
        }
    }

    public CLParser(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hasComment = r0
            r1.mContent = r2
            return
    }

    private androidx.constraintlayout.core.parser.CLElement createElement(androidx.constraintlayout.core.parser.CLElement r2, int r3, androidx.constraintlayout.core.parser.CLParser.TYPE r4, boolean r5, char[] r6) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 0
            switch(r4) {
                case 1: goto L27;
                case 2: goto L22;
                case 3: goto L1d;
                case 4: goto L18;
                case 5: goto L13;
                case 6: goto Le;
                default: goto Lc;
            }
        Lc:
            r4 = r0
            goto L2d
        Le:
            androidx.constraintlayout.core.parser.CLElement r4 = androidx.constraintlayout.core.parser.CLToken.allocate(r6)
            goto L2d
        L13:
            androidx.constraintlayout.core.parser.CLElement r4 = androidx.constraintlayout.core.parser.CLKey.allocate(r6)
            goto L2d
        L18:
            androidx.constraintlayout.core.parser.CLElement r4 = androidx.constraintlayout.core.parser.CLNumber.allocate(r6)
            goto L2d
        L1d:
            androidx.constraintlayout.core.parser.CLElement r4 = androidx.constraintlayout.core.parser.CLString.allocate(r6)
            goto L2d
        L22:
            androidx.constraintlayout.core.parser.CLElement r4 = androidx.constraintlayout.core.parser.CLArray.allocate(r6)
            goto L2b
        L27:
            androidx.constraintlayout.core.parser.CLObject r4 = androidx.constraintlayout.core.parser.CLObject.allocate(r6)
        L2b:
            int r3 = r3 + 1
        L2d:
            if (r4 != 0) goto L30
            return r0
        L30:
            int r6 = r1.lineNumber
            r4.setLine(r6)
            if (r5 == 0) goto L3b
            long r5 = (long) r3
            r4.setStart(r5)
        L3b:
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.CLContainer
            if (r3 == 0) goto L44
            androidx.constraintlayout.core.parser.CLContainer r2 = (androidx.constraintlayout.core.parser.CLContainer) r2
            r4.setContainer(r2)
        L44:
            return r4
    }

    private androidx.constraintlayout.core.parser.CLElement getNextJsonElement(int r8, char r9, androidx.constraintlayout.core.parser.CLElement r10, char[] r11) throws androidx.constraintlayout.core.parser.CLParsingException {
            r7 = this;
            r0 = 9
            if (r9 == r0) goto Ld5
            r0 = 10
            if (r9 == r0) goto Ld5
            r0 = 13
            if (r9 == r0) goto Ld5
            r0 = 32
            if (r9 == r0) goto Ld5
            r0 = 34
            if (r9 == r0) goto Lba
            r0 = 39
            if (r9 == r0) goto Lba
            r0 = 91
            if (r9 == r0) goto Lae
            r0 = 93
            if (r9 == r0) goto L9f
            r0 = 123(0x7b, float:1.72E-43)
            if (r9 == r0) goto L93
            r0 = 125(0x7d, float:1.75E-43)
            if (r9 == r0) goto L9f
            switch(r9) {
                case 43: goto L87;
                case 44: goto Ld5;
                case 45: goto L87;
                case 46: goto L87;
                case 47: goto L78;
                case 48: goto L87;
                case 49: goto L87;
                case 50: goto L87;
                case 51: goto L87;
                case 52: goto L87;
                case 53: goto L87;
                case 54: goto L87;
                case 55: goto L87;
                case 56: goto L87;
                case 57: goto L87;
                case 58: goto Ld5;
                default: goto L2b;
            }
        L2b:
            boolean r0 = r10 instanceof androidx.constraintlayout.core.parser.CLContainer
            if (r0 == 0) goto L6b
            boolean r0 = r10 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 != 0) goto L6b
            androidx.constraintlayout.core.parser.CLParser$TYPE r4 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN
            r5 = 1
            r1 = r7
            r2 = r10
            r3 = r8
            r6 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r1.createElement(r2, r3, r4, r5, r6)
            r11 = r10
            androidx.constraintlayout.core.parser.CLToken r11 = (androidx.constraintlayout.core.parser.CLToken) r11
            long r0 = (long) r8
            boolean r8 = r11.validate(r9, r0)
            if (r8 == 0) goto L4a
            goto Ld5
        L4a:
            androidx.constraintlayout.core.parser.CLParsingException r8 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "incorrect token <"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = "> at line "
            r10.append(r9)
            int r9 = r7.lineNumber
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9, r11)
            throw r8
        L6b:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        L78:
            r9 = 1
            int r8 = r8 + r9
            int r0 = r11.length
            if (r8 >= r0) goto Ld5
            char r8 = r11[r8]
            r11 = 47
            if (r8 != r11) goto Ld5
            r7.hasComment = r9
            goto Ld5
        L87:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        L93:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        L9f:
            int r9 = r8 + (-1)
            long r0 = (long) r9
            r10.setEnd(r0)
            androidx.constraintlayout.core.parser.CLElement r10 = r10.getContainer()
            long r8 = (long) r8
            r10.setEnd(r8)
            goto Ld5
        Lae:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        Lba:
            boolean r9 = r10 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r9 == 0) goto Lca
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        Lca:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
        Ld5:
            return r10
    }

    public static androidx.constraintlayout.core.parser.CLObject parse(java.lang.String r1) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.parser.CLParser r0 = new androidx.constraintlayout.core.parser.CLParser
            r0.<init>(r1)
            androidx.constraintlayout.core.parser.CLObject r1 = r0.parse()
            return r1
    }

    public androidx.constraintlayout.core.parser.CLObject parse() throws androidx.constraintlayout.core.parser.CLParsingException {
            r15 = this;
            java.lang.String r0 = r15.mContent
            char[] r0 = r0.toCharArray()
            int r1 = r0.length
            r2 = 1
            r15.lineNumber = r2
            r3 = 0
            r4 = 0
        Lc:
            r5 = -1
            r6 = 10
            if (r4 >= r1) goto L22
            char r7 = r0[r4]
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 != r8) goto L18
            goto L23
        L18:
            if (r7 != r6) goto L1f
            int r5 = r15.lineNumber
            int r5 = r5 + r2
            r15.lineNumber = r5
        L1f:
            int r4 = r4 + 1
            goto Lc
        L22:
            r4 = -1
        L23:
            if (r4 == r5) goto L168
            androidx.constraintlayout.core.parser.CLObject r5 = androidx.constraintlayout.core.parser.CLObject.allocate(r0)
            int r7 = r15.lineNumber
            r5.setLine(r7)
            long r7 = (long) r4
            r5.setStart(r7)
            int r4 = r4 + r2
            r7 = r5
        L34:
            if (r4 >= r1) goto L147
            char r8 = r0[r4]
            if (r8 != r6) goto L3f
            int r9 = r15.lineNumber
            int r9 = r9 + r2
            r15.lineNumber = r9
        L3f:
            boolean r2 = r15.hasComment
            if (r2 == 0) goto L47
            if (r8 != r6) goto L141
            r15.hasComment = r3
        L47:
            if (r7 != 0) goto L4b
            goto L147
        L4b:
            boolean r2 = r7.isDone()
            if (r2 == 0) goto L58
            androidx.constraintlayout.core.parser.CLElement r2 = r15.getNextJsonElement(r4, r8, r7, r0)
        L55:
            r7 = r2
            goto L128
        L58:
            boolean r2 = r7 instanceof androidx.constraintlayout.core.parser.CLObject
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == 0) goto L6d
            if (r8 != r3) goto L68
            int r2 = r4 + (-1)
            long r2 = (long) r2
            r7.setEnd(r2)
            goto L128
        L68:
            androidx.constraintlayout.core.parser.CLElement r2 = r15.getNextJsonElement(r4, r8, r7, r0)
            goto L55
        L6d:
            boolean r2 = r7 instanceof androidx.constraintlayout.core.parser.CLArray
            r9 = 93
            if (r2 == 0) goto L82
            if (r8 != r9) goto L7d
            int r2 = r4 + (-1)
            long r2 = (long) r2
            r7.setEnd(r2)
            goto L128
        L7d:
            androidx.constraintlayout.core.parser.CLElement r2 = r15.getNextJsonElement(r4, r8, r7, r0)
            goto L55
        L82:
            boolean r2 = r7 instanceof androidx.constraintlayout.core.parser.CLString
            r10 = 1
            if (r2 == 0) goto L9b
            long r2 = r7.start
            int r9 = (int) r2
            char r9 = r0[r9]
            if (r9 != r8) goto L128
            long r2 = r2 + r10
            r7.setStart(r2)
            int r2 = r4 + (-1)
            long r2 = (long) r2
            r7.setEnd(r2)
            goto L128
        L9b:
            boolean r12 = r7 instanceof androidx.constraintlayout.core.parser.CLToken
            if (r12 == 0) goto Lcb
            r12 = r7
            androidx.constraintlayout.core.parser.CLToken r12 = (androidx.constraintlayout.core.parser.CLToken) r12
            long r13 = (long) r4
            boolean r13 = r12.validate(r8, r13)
            if (r13 == 0) goto Laa
            goto Lcb
        Laa:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "parsing incorrect token "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r12.content()
            r1.append(r2)
            java.lang.String r2 = " at line "
            r1.append(r2)
            int r2 = r15.lineNumber
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r12)
            throw r0
        Lcb:
            boolean r12 = r7 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r12 != 0) goto Ld1
            if (r2 == 0) goto Lea
        Ld1:
            long r12 = r7.start
            int r2 = (int) r12
            char r2 = r0[r2]
            r14 = 39
            if (r2 == r14) goto Lde
            r14 = 34
            if (r2 != r14) goto Lea
        Lde:
            if (r2 != r8) goto Lea
            long r12 = r12 + r10
            r7.setStart(r12)
            int r2 = r4 + (-1)
            long r10 = (long) r2
            r7.setEnd(r10)
        Lea:
            boolean r2 = r7.isDone()
            if (r2 != 0) goto L128
            if (r8 == r3) goto L10a
            if (r8 == r9) goto L10a
            r2 = 44
            if (r8 == r2) goto L10a
            r2 = 32
            if (r8 == r2) goto L10a
            r2 = 9
            if (r8 == r2) goto L10a
            r2 = 13
            if (r8 == r2) goto L10a
            if (r8 == r6) goto L10a
            r2 = 58
            if (r8 != r2) goto L128
        L10a:
            int r2 = r4 + (-1)
            long r10 = (long) r2
            r7.setEnd(r10)
            if (r8 == r3) goto L114
            if (r8 != r9) goto L128
        L114:
            androidx.constraintlayout.core.parser.CLElement r2 = r7.getContainer()
            r2.setEnd(r10)
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r3 == 0) goto L55
            androidx.constraintlayout.core.parser.CLElement r2 = r2.getContainer()
            r2.setEnd(r10)
            goto L55
        L128:
            boolean r2 = r7.isDone()
            if (r2 == 0) goto L141
            boolean r2 = r7 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r2 == 0) goto L13d
            r2 = r7
            androidx.constraintlayout.core.parser.CLKey r2 = (androidx.constraintlayout.core.parser.CLKey) r2
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r2 = r2.mElements
            int r2 = r2.size()
            if (r2 <= 0) goto L141
        L13d:
            androidx.constraintlayout.core.parser.CLElement r7 = r7.getContainer()
        L141:
            int r4 = r4 + 1
            r2 = 1
            r3 = 0
            goto L34
        L147:
            if (r7 == 0) goto L167
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L167
            boolean r0 = r7 instanceof androidx.constraintlayout.core.parser.CLString
            if (r0 == 0) goto L15c
            long r2 = r7.start
            int r0 = (int) r2
            int r0 = r0 + 1
            long r2 = (long) r0
            r7.setStart(r2)
        L15c:
            int r0 = r1 + (-1)
            long r2 = (long) r0
            r7.setEnd(r2)
            androidx.constraintlayout.core.parser.CLElement r7 = r7.getContainer()
            goto L147
        L167:
            return r5
        L168:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            r1 = 0
            java.lang.String r2 = "invalid json content"
            r0.<init>(r2, r1)
            throw r0
    }
}
