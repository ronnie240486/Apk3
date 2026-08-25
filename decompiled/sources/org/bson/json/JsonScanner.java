package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class JsonScanner {
    private final org.bson.json.JsonBuffer buffer;

    /* JADX INFO: renamed from: org.bson.json.JsonScanner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$json$JsonScanner$NumberState = null;
        public static final /* synthetic */ int[] $SwitchMap$org$bson$json$JsonScanner$RegularExpressionState = null;

        static {
                org.bson.json.JsonScanner$NumberState[] r0 = org.bson.json.JsonScanner.NumberState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState = r0
                r1 = 1
                org.bson.json.JsonScanner$NumberState r2 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_MINUS     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.json.JsonScanner$NumberState r3 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L3e
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L49
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER     // Catch: java.lang.NoSuchFieldError -> L49
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r7 = 6
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L54
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_SIGN     // Catch: java.lang.NoSuchFieldError -> L54
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7 = 7
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L60
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS     // Catch: java.lang.NoSuchFieldError -> L60
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r7 = 8
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L6c
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_MINUS_I     // Catch: java.lang.NoSuchFieldError -> L6c
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r7 = 9
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L78
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.INVALID     // Catch: java.lang.NoSuchFieldError -> L78
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r7 = 10
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r5 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState     // Catch: java.lang.NoSuchFieldError -> L84
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.DONE     // Catch: java.lang.NoSuchFieldError -> L84
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r7 = 11
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                org.bson.json.JsonScanner$RegularExpressionState[] r5 = org.bson.json.JsonScanner.RegularExpressionState.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$RegularExpressionState = r5
                org.bson.json.JsonScanner$RegularExpressionState r6 = org.bson.json.JsonScanner.RegularExpressionState.IN_PATTERN     // Catch: java.lang.NoSuchFieldError -> L95
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L95
                r5[r6] = r1     // Catch: java.lang.NoSuchFieldError -> L95
            L95:
                int[] r1 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$RegularExpressionState     // Catch: java.lang.NoSuchFieldError -> L9f
                org.bson.json.JsonScanner$RegularExpressionState r5 = org.bson.json.JsonScanner.RegularExpressionState.IN_ESCAPE_SEQUENCE     // Catch: java.lang.NoSuchFieldError -> L9f
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9f
                r1[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L9f
            L9f:
                int[] r0 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$RegularExpressionState     // Catch: java.lang.NoSuchFieldError -> La9
                org.bson.json.JsonScanner$RegularExpressionState r1 = org.bson.json.JsonScanner.RegularExpressionState.IN_OPTIONS     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
            La9:
                int[] r0 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$RegularExpressionState     // Catch: java.lang.NoSuchFieldError -> Lb3
                org.bson.json.JsonScanner$RegularExpressionState r1 = org.bson.json.JsonScanner.RegularExpressionState.DONE     // Catch: java.lang.NoSuchFieldError -> Lb3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb3
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> Lb3
            Lb3:
                int[] r0 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$RegularExpressionState     // Catch: java.lang.NoSuchFieldError -> Lbd
                org.bson.json.JsonScanner$RegularExpressionState r1 = org.bson.json.JsonScanner.RegularExpressionState.INVALID     // Catch: java.lang.NoSuchFieldError -> Lbd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbd
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> Lbd
            Lbd:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum NumberState extends java.lang.Enum<org.bson.json.JsonScanner.NumberState> {
        private static final /* synthetic */ org.bson.json.JsonScanner.NumberState[] $VALUES = null;
        public static final org.bson.json.JsonScanner.NumberState DONE = null;
        public static final org.bson.json.JsonScanner.NumberState INVALID = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_DECIMAL_POINT = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_EXPONENT_DIGITS = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_EXPONENT_LETTER = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_EXPONENT_SIGN = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_FRACTION_DIGITS = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_INTEGER_DIGITS = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_LEADING_MINUS = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_LEADING_ZERO = null;
        public static final org.bson.json.JsonScanner.NumberState SAW_MINUS_I = null;

        static {
                org.bson.json.JsonScanner$NumberState r0 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r1 = "SAW_LEADING_MINUS"
                r2 = 0
                r0.<init>(r1, r2)
                org.bson.json.JsonScanner.NumberState.SAW_LEADING_MINUS = r0
                org.bson.json.JsonScanner$NumberState r1 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r3 = "SAW_LEADING_ZERO"
                r4 = 1
                r1.<init>(r3, r4)
                org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO = r1
                org.bson.json.JsonScanner$NumberState r3 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r5 = "SAW_INTEGER_DIGITS"
                r6 = 2
                r3.<init>(r5, r6)
                org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS = r3
                org.bson.json.JsonScanner$NumberState r5 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r7 = "SAW_DECIMAL_POINT"
                r8 = 3
                r5.<init>(r7, r8)
                org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT = r5
                org.bson.json.JsonScanner$NumberState r7 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r9 = "SAW_FRACTION_DIGITS"
                r10 = 4
                r7.<init>(r9, r10)
                org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS = r7
                org.bson.json.JsonScanner$NumberState r9 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r11 = "SAW_EXPONENT_LETTER"
                r12 = 5
                r9.<init>(r11, r12)
                org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER = r9
                org.bson.json.JsonScanner$NumberState r11 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r13 = "SAW_EXPONENT_SIGN"
                r14 = 6
                r11.<init>(r13, r14)
                org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_SIGN = r11
                org.bson.json.JsonScanner$NumberState r13 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r15 = "SAW_EXPONENT_DIGITS"
                r14 = 7
                r13.<init>(r15, r14)
                org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS = r13
                org.bson.json.JsonScanner$NumberState r15 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r14 = "SAW_MINUS_I"
                r12 = 8
                r15.<init>(r14, r12)
                org.bson.json.JsonScanner.NumberState.SAW_MINUS_I = r15
                org.bson.json.JsonScanner$NumberState r14 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r12 = "DONE"
                r10 = 9
                r14.<init>(r12, r10)
                org.bson.json.JsonScanner.NumberState.DONE = r14
                org.bson.json.JsonScanner$NumberState r12 = new org.bson.json.JsonScanner$NumberState
                java.lang.String r10 = "INVALID"
                r8 = 10
                r12.<init>(r10, r8)
                org.bson.json.JsonScanner.NumberState.INVALID = r12
                r10 = 11
                org.bson.json.JsonScanner$NumberState[] r10 = new org.bson.json.JsonScanner.NumberState[r10]
                r10[r2] = r0
                r10[r4] = r1
                r10[r6] = r3
                r0 = 3
                r10[r0] = r5
                r0 = 4
                r10[r0] = r7
                r0 = 5
                r10[r0] = r9
                r0 = 6
                r10[r0] = r11
                r0 = 7
                r10[r0] = r13
                r0 = 8
                r10[r0] = r15
                r0 = 9
                r10[r0] = r14
                r10[r8] = r12
                org.bson.json.JsonScanner.NumberState.$VALUES = r10
                return
        }

        private NumberState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.bson.json.JsonScanner.NumberState valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.json.JsonScanner$NumberState> r0 = org.bson.json.JsonScanner.NumberState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.json.JsonScanner$NumberState r1 = (org.bson.json.JsonScanner.NumberState) r1
                return r1
        }

        public static org.bson.json.JsonScanner.NumberState[] values() {
                org.bson.json.JsonScanner$NumberState[] r0 = org.bson.json.JsonScanner.NumberState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.json.JsonScanner$NumberState[] r0 = (org.bson.json.JsonScanner.NumberState[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum RegularExpressionState extends java.lang.Enum<org.bson.json.JsonScanner.RegularExpressionState> {
        private static final /* synthetic */ org.bson.json.JsonScanner.RegularExpressionState[] $VALUES = null;
        public static final org.bson.json.JsonScanner.RegularExpressionState DONE = null;
        public static final org.bson.json.JsonScanner.RegularExpressionState INVALID = null;
        public static final org.bson.json.JsonScanner.RegularExpressionState IN_ESCAPE_SEQUENCE = null;
        public static final org.bson.json.JsonScanner.RegularExpressionState IN_OPTIONS = null;
        public static final org.bson.json.JsonScanner.RegularExpressionState IN_PATTERN = null;

        static {
                org.bson.json.JsonScanner$RegularExpressionState r0 = new org.bson.json.JsonScanner$RegularExpressionState
                java.lang.String r1 = "IN_PATTERN"
                r2 = 0
                r0.<init>(r1, r2)
                org.bson.json.JsonScanner.RegularExpressionState.IN_PATTERN = r0
                org.bson.json.JsonScanner$RegularExpressionState r1 = new org.bson.json.JsonScanner$RegularExpressionState
                java.lang.String r3 = "IN_ESCAPE_SEQUENCE"
                r4 = 1
                r1.<init>(r3, r4)
                org.bson.json.JsonScanner.RegularExpressionState.IN_ESCAPE_SEQUENCE = r1
                org.bson.json.JsonScanner$RegularExpressionState r3 = new org.bson.json.JsonScanner$RegularExpressionState
                java.lang.String r5 = "IN_OPTIONS"
                r6 = 2
                r3.<init>(r5, r6)
                org.bson.json.JsonScanner.RegularExpressionState.IN_OPTIONS = r3
                org.bson.json.JsonScanner$RegularExpressionState r5 = new org.bson.json.JsonScanner$RegularExpressionState
                java.lang.String r7 = "DONE"
                r8 = 3
                r5.<init>(r7, r8)
                org.bson.json.JsonScanner.RegularExpressionState.DONE = r5
                org.bson.json.JsonScanner$RegularExpressionState r7 = new org.bson.json.JsonScanner$RegularExpressionState
                java.lang.String r9 = "INVALID"
                r10 = 4
                r7.<init>(r9, r10)
                org.bson.json.JsonScanner.RegularExpressionState.INVALID = r7
                r9 = 5
                org.bson.json.JsonScanner$RegularExpressionState[] r9 = new org.bson.json.JsonScanner.RegularExpressionState[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                org.bson.json.JsonScanner.RegularExpressionState.$VALUES = r9
                return
        }

        private RegularExpressionState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.bson.json.JsonScanner.RegularExpressionState valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.json.JsonScanner$RegularExpressionState> r0 = org.bson.json.JsonScanner.RegularExpressionState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.json.JsonScanner$RegularExpressionState r1 = (org.bson.json.JsonScanner.RegularExpressionState) r1
                return r1
        }

        public static org.bson.json.JsonScanner.RegularExpressionState[] values() {
                org.bson.json.JsonScanner$RegularExpressionState[] r0 = org.bson.json.JsonScanner.RegularExpressionState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.json.JsonScanner$RegularExpressionState[] r0 = (org.bson.json.JsonScanner.RegularExpressionState[]) r0
                return r0
        }
    }

    public JsonScanner(java.io.Reader r2) {
            r1 = this;
            org.bson.json.JsonStreamBuffer r0 = new org.bson.json.JsonStreamBuffer
            r0.<init>(r2)
            r1.<init>()
            r1.buffer = r0
            return
    }

    public JsonScanner(java.lang.String r2) {
            r1 = this;
            org.bson.json.JsonStringBuffer r0 = new org.bson.json.JsonStringBuffer
            r0.<init>(r2)
            r1.<init>()
            r1.buffer = r0
            return
    }

    private org.bson.json.JsonToken scanNumber(char r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r3 = 48
            r4 = 45
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L17
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L1c
        L17:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO
            goto L1c
        L1a:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_MINUS
        L1c:
            org.bson.json.JsonTokenType r5 = org.bson.json.JsonTokenType.INT64
        L1e:
            org.bson.json.JsonBuffer r6 = r0.buffer
            int r6 = r6.read()
            int[] r7 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState
            int r8 = r1.ordinal()
            r7 = r7[r8]
            r8 = 46
            r9 = 101(0x65, float:1.42E-43)
            r10 = 69
            r11 = -1
            r12 = 125(0x7d, float:1.75E-43)
            r13 = 93
            r14 = 44
            r15 = 41
            switch(r7) {
                case 1: goto L169;
                case 2: goto L13b;
                case 3: goto L10c;
                case 4: goto Lf8;
                case 5: goto Lca;
                case 6: goto Lb3;
                case 7: goto La5;
                case 8: goto L81;
                case 9: goto L40;
                default: goto L3e;
            }
        L3e:
            goto L180
        L40:
            r1 = 7
            char[] r7 = new char[r1]
            r7 = {x01fc: FILL_ARRAY_DATA , data: [110, 102, 105, 110, 105, 116, 121} // fill-array
            r8 = 0
            r9 = 0
        L48:
            if (r9 >= r1) goto L5c
            char r10 = r7[r9]
            if (r6 == r10) goto L4f
            goto L5d
        L4f:
            char r6 = (char) r6
            r2.append(r6)
            org.bson.json.JsonBuffer r6 = r0.buffer
            int r6 = r6.read()
            int r9 = r9 + 1
            goto L48
        L5c:
            r8 = 1
        L5d:
            if (r8 == 0) goto L7d
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE
            if (r6 == r11) goto L79
            if (r6 == r15) goto L79
            if (r6 == r14) goto L79
            if (r6 == r13) goto L79
            if (r6 == r12) goto L79
            boolean r5 = java.lang.Character.isWhitespace(r6)
            if (r5 == 0) goto L75
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.DONE
            goto L105
        L75:
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L105
        L79:
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.DONE
            goto L105
        L7d:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        L81:
            if (r6 == r15) goto La1
            if (r6 == r14) goto La1
            if (r6 == r13) goto La1
            if (r6 == r12) goto La1
            boolean r1 = java.lang.Character.isDigit(r6)
            if (r1 == 0) goto L93
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS
            goto L180
        L93:
            boolean r1 = java.lang.Character.isWhitespace(r6)
            if (r1 == 0) goto L9d
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        L9d:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        La1:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        La5:
            boolean r1 = java.lang.Character.isDigit(r6)
            if (r1 == 0) goto Laf
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS
            goto L180
        Laf:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        Lb3:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE
            r5 = 43
            if (r6 == r5) goto Lc7
            if (r6 == r4) goto Lc7
            boolean r5 = java.lang.Character.isDigit(r6)
            if (r5 == 0) goto Lc4
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS
            goto L105
        Lc4:
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L105
        Lc7:
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_SIGN
            goto L105
        Lca:
            if (r6 == r11) goto Lf4
            if (r6 == r15) goto Lf4
            if (r6 == r14) goto Lf4
            if (r6 == r10) goto Lf0
            if (r6 == r13) goto Lf4
            if (r6 == r9) goto Lf0
            if (r6 == r12) goto Lf4
            boolean r1 = java.lang.Character.isDigit(r6)
            if (r1 == 0) goto Le2
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS
            goto L180
        Le2:
            boolean r1 = java.lang.Character.isWhitespace(r6)
            if (r1 == 0) goto Lec
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        Lec:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        Lf0:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER
            goto L180
        Lf4:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        Lf8:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE
            boolean r5 = java.lang.Character.isDigit(r6)
            if (r5 == 0) goto L103
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS
            goto L105
        L103:
            org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.INVALID
        L105:
            r16 = r5
            r5 = r1
            r1 = r16
            goto L180
        L10c:
            if (r6 == r11) goto L138
            if (r6 == r15) goto L138
            if (r6 == r14) goto L138
            if (r6 == r8) goto L135
            if (r6 == r10) goto L132
            if (r6 == r13) goto L138
            if (r6 == r9) goto L132
            if (r6 == r12) goto L138
            boolean r1 = java.lang.Character.isDigit(r6)
            if (r1 == 0) goto L126
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L180
        L126:
            boolean r1 = java.lang.Character.isWhitespace(r6)
            if (r1 == 0) goto L12f
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        L12f:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        L132:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER
            goto L180
        L135:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT
            goto L180
        L138:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        L13b:
            if (r6 == r11) goto L166
            if (r6 == r15) goto L166
            if (r6 == r14) goto L166
            if (r6 == r8) goto L163
            if (r6 == r10) goto L160
            if (r6 == r13) goto L166
            if (r6 == r9) goto L160
            if (r6 == r12) goto L166
            boolean r1 = java.lang.Character.isDigit(r6)
            if (r1 == 0) goto L154
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L180
        L154:
            boolean r1 = java.lang.Character.isWhitespace(r6)
            if (r1 == 0) goto L15d
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        L15d:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        L160:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER
            goto L180
        L163:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT
            goto L180
        L166:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L180
        L169:
            if (r6 == r3) goto L17e
            r1 = 73
            if (r6 == r1) goto L17b
            boolean r1 = java.lang.Character.isDigit(r6)
            if (r1 == 0) goto L178
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L180
        L178:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L180
        L17b:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_MINUS_I
            goto L180
        L17e:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO
        L180:
            int[] r7 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$NumberState
            int r8 = r1.ordinal()
            r7 = r7[r8]
            r8 = 10
            if (r7 == r8) goto L1dd
            r8 = 11
            if (r7 == r8) goto L196
            char r6 = (char) r6
            r2.append(r6)
            goto L1e
        L196:
            org.bson.json.JsonBuffer r1 = r0.buffer
            r1.unread(r6)
            java.lang.String r1 = r2.toString()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.DOUBLE
            if (r5 != r2) goto L1b1
            org.bson.json.JsonToken r3 = new org.bson.json.JsonToken
            double r4 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r4)
            r3.<init>(r2, r1)
            return r3
        L1b1:
            long r1 = java.lang.Long.parseLong(r1)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L1d1
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1c4
            goto L1d1
        L1c4:
            org.bson.json.JsonToken r3 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.INT32
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r3.<init>(r4, r1)
            return r3
        L1d1:
            org.bson.json.JsonToken r3 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.INT64
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.<init>(r4, r1)
            return r3
        L1dd:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.String r2 = "Invalid JSON number"
            r1.<init>(r2)
            throw r1
    }

    private org.bson.json.JsonToken scanRegularExpression() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.IN_PATTERN
        Lc:
            org.bson.json.JsonBuffer r3 = r11.buffer
            int r3 = r3.read()
            int[] r4 = org.bson.json.JsonScanner.AnonymousClass1.$SwitchMap$org$bson$json$JsonScanner$RegularExpressionState
            int r5 = r2.ordinal()
            r5 = r4[r5]
            r6 = 47
            r7 = -1
            r8 = 3
            r9 = 1
            if (r5 == r9) goto L5e
            r10 = 2
            if (r5 == r10) goto L5b
            if (r5 == r8) goto L27
            goto L71
        L27:
            if (r3 == r7) goto L58
            r2 = 41
            if (r3 == r2) goto L58
            r2 = 44
            if (r3 == r2) goto L58
            r2 = 93
            if (r3 == r2) goto L58
            r2 = 105(0x69, float:1.47E-43)
            if (r3 == r2) goto L55
            r2 = 109(0x6d, float:1.53E-43)
            if (r3 == r2) goto L55
            r2 = 115(0x73, float:1.61E-43)
            if (r3 == r2) goto L55
            r2 = 120(0x78, float:1.68E-43)
            if (r3 == r2) goto L55
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 == r2) goto L58
            boolean r2 = java.lang.Character.isWhitespace(r3)
            if (r2 == 0) goto L52
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.DONE
            goto L71
        L52:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.INVALID
            goto L71
        L55:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.IN_OPTIONS
            goto L71
        L58:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.DONE
            goto L71
        L5b:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.IN_PATTERN
            goto L71
        L5e:
            if (r3 == r7) goto L6f
            if (r3 == r6) goto L6c
            r2 = 92
            if (r3 == r2) goto L69
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.IN_PATTERN
            goto L71
        L69:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.IN_ESCAPE_SEQUENCE
            goto L71
        L6c:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.IN_OPTIONS
            goto L71
        L6f:
            org.bson.json.JsonScanner$RegularExpressionState r2 = org.bson.json.JsonScanner.RegularExpressionState.INVALID
        L71:
            int r5 = r2.ordinal()
            r5 = r4[r5]
            r7 = 4
            if (r5 == r7) goto La9
            r7 = 5
            if (r5 == r7) goto L92
            int r5 = r2.ordinal()
            r4 = r4[r5]
            if (r4 == r8) goto L8a
            char r3 = (char) r3
            r0.append(r3)
            goto Lc
        L8a:
            if (r3 == r6) goto Lc
            char r3 = (char) r3
            r1.append(r3)
            goto Lc
        L92:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r2 = 0
            org.bson.json.JsonBuffer r3 = r11.buffer
            int r3 = r3.getPosition()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Invalid JSON regular expression. Position: %d."
            r0.<init>(r2, r1)
            throw r0
        La9:
            org.bson.json.JsonBuffer r2 = r11.buffer
            r2.unread(r3)
            org.bson.BsonRegularExpression r2 = new org.bson.BsonRegularExpression
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r0, r1)
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.REGULAR_EXPRESSION
            r0.<init>(r1, r2)
            return r0
    }

    private org.bson.json.JsonToken scanString(char r12) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            org.bson.json.JsonBuffer r1 = r11.buffer
            int r1 = r1.read()
            r2 = -1
            r3 = 92
            if (r1 == r3) goto L26
            if (r1 != r12) goto L1e
            org.bson.json.JsonToken r12 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.STRING
            java.lang.String r0 = r0.toString()
            r12.<init>(r1, r0)
            return r12
        L1e:
            if (r1 == r2) goto Lcc
            char r3 = (char) r1
            r0.append(r3)
            goto Lcc
        L26:
            org.bson.json.JsonBuffer r1 = r11.buffer
            int r1 = r1.read()
            r4 = 34
            if (r1 == r4) goto Lc9
            r4 = 39
            if (r1 == r4) goto Lc5
            r4 = 47
            if (r1 == r4) goto Lc1
            if (r1 == r3) goto Lbd
            r3 = 98
            if (r1 == r3) goto Lb7
            r3 = 102(0x66, float:1.43E-43)
            if (r1 == r3) goto Lb1
            r3 = 110(0x6e, float:1.54E-43)
            if (r1 == r3) goto Lab
            r3 = 114(0x72, float:1.6E-43)
            if (r1 == r3) goto La5
            r3 = 116(0x74, float:1.63E-43)
            if (r1 == r3) goto L9f
            r3 = 117(0x75, float:1.64E-43)
            r4 = 0
            r5 = 1
            if (r1 != r3) goto L8f
            org.bson.json.JsonBuffer r3 = r11.buffer
            int r3 = r3.read()
            org.bson.json.JsonBuffer r6 = r11.buffer
            int r6 = r6.read()
            org.bson.json.JsonBuffer r7 = r11.buffer
            int r7 = r7.read()
            org.bson.json.JsonBuffer r8 = r11.buffer
            int r8 = r8.read()
            if (r8 == r2) goto Lcc
            java.lang.String r9 = new java.lang.String
            r10 = 4
            char[] r10 = new char[r10]
            char r3 = (char) r3
            r10[r4] = r3
            char r3 = (char) r6
            r10[r5] = r3
            r3 = 2
            char r4 = (char) r7
            r10[r3] = r4
            r3 = 3
            char r4 = (char) r8
            r10[r3] = r4
            r9.<init>(r10)
            r3 = 16
            int r3 = java.lang.Integer.parseInt(r9, r3)
            char r3 = (char) r3
            r0.append(r3)
            goto Lcc
        L8f:
            org.bson.json.JsonParseException r12 = new org.bson.json.JsonParseException
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "Invalid escape sequence in JSON string '\\%c'."
            r12.<init>(r1, r0)
            throw r12
        L9f:
            r3 = 9
            r0.append(r3)
            goto Lcc
        La5:
            r3 = 13
            r0.append(r3)
            goto Lcc
        Lab:
            r3 = 10
            r0.append(r3)
            goto Lcc
        Lb1:
            r3 = 12
            r0.append(r3)
            goto Lcc
        Lb7:
            r3 = 8
            r0.append(r3)
            goto Lcc
        Lbd:
            r0.append(r3)
            goto Lcc
        Lc1:
            r0.append(r4)
            goto Lcc
        Lc5:
            r0.append(r4)
            goto Lcc
        Lc9:
            r0.append(r4)
        Lcc:
            if (r1 == r2) goto Ld0
            goto L5
        Ld0:
            org.bson.json.JsonParseException r12 = new org.bson.json.JsonParseException
            java.lang.String r0 = "End of file in JSON string."
            r12.<init>(r0)
            throw r12
    }

    private org.bson.json.JsonToken scanUnquotedString(char r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            org.bson.json.JsonBuffer r3 = r2.buffer
            int r3 = r3.read()
        Le:
            r1 = 36
            if (r3 == r1) goto L2e
            r1 = 95
            if (r3 == r1) goto L2e
            boolean r1 = java.lang.Character.isLetterOrDigit(r3)
            if (r1 == 0) goto L1d
            goto L2e
        L1d:
            org.bson.json.JsonBuffer r1 = r2.buffer
            r1.unread(r3)
            java.lang.String r3 = r0.toString()
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.UNQUOTED_STRING
            r0.<init>(r1, r3)
            return r0
        L2e:
            char r3 = (char) r3
            r0.append(r3)
            org.bson.json.JsonBuffer r3 = r2.buffer
            int r3 = r3.read()
            goto Le
    }

    public void discard(int r2) {
            r1 = this;
            org.bson.json.JsonBuffer r0 = r1.buffer
            r0.discard(r2)
            return
    }

    public int mark() {
            r1 = this;
            org.bson.json.JsonBuffer r0 = r1.buffer
            int r0 = r0.mark()
            return r0
    }

    public org.bson.json.JsonToken nextToken() {
            r5 = this;
            org.bson.json.JsonBuffer r0 = r5.buffer
            int r0 = r0.read()
        L6:
            r1 = -1
            if (r0 == r1) goto L16
            boolean r2 = java.lang.Character.isWhitespace(r0)
            if (r2 == 0) goto L16
            org.bson.json.JsonBuffer r0 = r5.buffer
            int r0 = r0.read()
            goto L6
        L16:
            if (r0 != r1) goto L22
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OF_FILE
            java.lang.String r2 = "<eof>"
            r0.<init>(r1, r2)
            return r0
        L22:
            r1 = 34
            if (r0 == r1) goto Le4
            r1 = 44
            if (r0 == r1) goto Lda
            r1 = 47
            if (r0 == r1) goto Ld5
            r1 = 58
            if (r0 == r1) goto Lcb
            r1 = 91
            if (r0 == r1) goto Lc1
            r1 = 93
            if (r0 == r1) goto Lb7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto Lad
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto La3
            switch(r0) {
                case 39: goto Le4;
                case 40: goto L99;
                case 41: goto L8f;
                default: goto L45;
            }
        L45:
            r1 = 45
            if (r0 == r1) goto L89
            boolean r1 = java.lang.Character.isDigit(r0)
            if (r1 == 0) goto L50
            goto L89
        L50:
            r1 = 36
            if (r0 == r1) goto L83
            r1 = 95
            if (r0 == r1) goto L83
            boolean r1 = java.lang.Character.isLetter(r0)
            if (r1 == 0) goto L5f
            goto L83
        L5f:
            org.bson.json.JsonBuffer r1 = r5.buffer
            int r1 = r1.getPosition()
            org.bson.json.JsonBuffer r2 = r5.buffer
            r2.unread(r0)
            org.bson.json.JsonParseException r2 = new org.bson.json.JsonParseException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r4] = r1
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            java.lang.String r0 = "Invalid JSON input. Position: %d. Character: '%c'."
            r2.<init>(r0, r3)
            throw r2
        L83:
            char r0 = (char) r0
            org.bson.json.JsonToken r0 = r5.scanUnquotedString(r0)
            return r0
        L89:
            char r0 = (char) r0
            org.bson.json.JsonToken r0 = r5.scanNumber(r0)
            return r0
        L8f:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.RIGHT_PAREN
            java.lang.String r2 = ")"
            r0.<init>(r1, r2)
            return r0
        L99:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.LEFT_PAREN
            java.lang.String r2 = "("
            r0.<init>(r1, r2)
            return r0
        La3:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT
            java.lang.String r2 = "}"
            r0.<init>(r1, r2)
            return r0
        Lad:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_OBJECT
            java.lang.String r2 = "{"
            r0.<init>(r1, r2)
            return r0
        Lb7:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_ARRAY
            java.lang.String r2 = "]"
            r0.<init>(r1, r2)
            return r0
        Lc1:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_ARRAY
            java.lang.String r2 = "["
            r0.<init>(r1, r2)
            return r0
        Lcb:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COLON
            java.lang.String r2 = ":"
            r0.<init>(r1, r2)
            return r0
        Ld5:
            org.bson.json.JsonToken r0 = r5.scanRegularExpression()
            return r0
        Lda:
            org.bson.json.JsonToken r0 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA
            java.lang.String r2 = ","
            r0.<init>(r1, r2)
            return r0
        Le4:
            char r0 = (char) r0
            org.bson.json.JsonToken r0 = r5.scanString(r0)
            return r0
    }

    public void reset(int r2) {
            r1 = this;
            org.bson.json.JsonBuffer r0 = r1.buffer
            r0.reset(r2)
            return
    }
}
