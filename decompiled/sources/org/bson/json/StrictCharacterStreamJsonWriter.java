package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
public final class StrictCharacterStreamJsonWriter implements org.bson.json.StrictJsonWriter {
    private org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext context;
    private int curLength;
    private boolean isTruncated;
    private final org.bson.json.StrictCharacterStreamJsonWriterSettings settings;
    private org.bson.json.StrictCharacterStreamJsonWriter.State state;
    private final java.io.Writer writer;

    public static final enum JsonContextType extends java.lang.Enum<org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType> {
        private static final /* synthetic */ org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType[] $VALUES = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType ARRAY = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType DOCUMENT = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType TOP_LEVEL = null;

        static {
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = new org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType
                java.lang.String r1 = "TOP_LEVEL"
                r2 = 0
                r0.<init>(r1, r2)
                org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.TOP_LEVEL = r0
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = new org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType
                java.lang.String r3 = "DOCUMENT"
                r4 = 1
                r1.<init>(r3, r4)
                org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.DOCUMENT = r1
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r3 = new org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType
                java.lang.String r5 = "ARRAY"
                r6 = 2
                r3.<init>(r5, r6)
                org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.ARRAY = r3
                r5 = 3
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType[] r5 = new org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.$VALUES = r5
                return
        }

        private JsonContextType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType> r0 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = (org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType) r1
                return r1
        }

        public static org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType[] values() {
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType[] r0 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType[] r0 = (org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType[]) r0
                return r0
        }
    }

    public static final enum State extends java.lang.Enum<org.bson.json.StrictCharacterStreamJsonWriter.State> {
        private static final /* synthetic */ org.bson.json.StrictCharacterStreamJsonWriter.State[] $VALUES = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.State DONE = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.State INITIAL = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.State NAME = null;
        public static final org.bson.json.StrictCharacterStreamJsonWriter.State VALUE = null;

        static {
                org.bson.json.StrictCharacterStreamJsonWriter$State r0 = new org.bson.json.StrictCharacterStreamJsonWriter$State
                java.lang.String r1 = "INITIAL"
                r2 = 0
                r0.<init>(r1, r2)
                org.bson.json.StrictCharacterStreamJsonWriter.State.INITIAL = r0
                org.bson.json.StrictCharacterStreamJsonWriter$State r1 = new org.bson.json.StrictCharacterStreamJsonWriter$State
                java.lang.String r3 = "NAME"
                r4 = 1
                r1.<init>(r3, r4)
                org.bson.json.StrictCharacterStreamJsonWriter.State.NAME = r1
                org.bson.json.StrictCharacterStreamJsonWriter$State r3 = new org.bson.json.StrictCharacterStreamJsonWriter$State
                java.lang.String r5 = "VALUE"
                r6 = 2
                r3.<init>(r5, r6)
                org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE = r3
                org.bson.json.StrictCharacterStreamJsonWriter$State r5 = new org.bson.json.StrictCharacterStreamJsonWriter$State
                java.lang.String r7 = "DONE"
                r8 = 3
                r5.<init>(r7, r8)
                org.bson.json.StrictCharacterStreamJsonWriter.State.DONE = r5
                r7 = 4
                org.bson.json.StrictCharacterStreamJsonWriter$State[] r7 = new org.bson.json.StrictCharacterStreamJsonWriter.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.bson.json.StrictCharacterStreamJsonWriter.State.$VALUES = r7
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.bson.json.StrictCharacterStreamJsonWriter.State valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.json.StrictCharacterStreamJsonWriter$State> r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.json.StrictCharacterStreamJsonWriter$State r1 = (org.bson.json.StrictCharacterStreamJsonWriter.State) r1
                return r1
        }

        public static org.bson.json.StrictCharacterStreamJsonWriter.State[] values() {
                org.bson.json.StrictCharacterStreamJsonWriter$State[] r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.json.StrictCharacterStreamJsonWriter$State[] r0 = (org.bson.json.StrictCharacterStreamJsonWriter.State[]) r0
                return r0
        }
    }

    public static class StrictJsonContext {
        private final org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType contextType;
        private boolean hasElements;
        private final java.lang.String indentation;
        private final org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext parentContext;

        public StrictJsonContext(org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext r1, org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.parentContext = r1
                r0.contextType = r2
                if (r1 != 0) goto La
                goto L15
            La:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r1 = r1.indentation
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r3)
            L15:
                r0.indentation = r3
                return
        }

        public static /* synthetic */ boolean access$000(org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext r0) {
                boolean r0 = r0.hasElements
                return r0
        }

        public static /* synthetic */ void access$002(org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext r1) {
                r0 = 1
                r1.hasElements = r0
                return
        }

        public static /* synthetic */ java.lang.String access$100(org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext r0) {
                java.lang.String r0 = r0.indentation
                return r0
        }

        public static /* synthetic */ org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext access$200(org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext r0) {
                org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r0.parentContext
                return r0
        }

        public static /* synthetic */ org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType access$300(org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext r0) {
                org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = r0.contextType
                return r0
        }
    }

    public StrictCharacterStreamJsonWriter(java.io.Writer r5, org.bson.json.StrictCharacterStreamJsonWriterSettings r6) {
            r4 = this;
            r4.<init>()
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = new org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.TOP_LEVEL
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r2, r1, r3)
            r4.context = r0
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.INITIAL
            r4.state = r0
            r4.writer = r5
            r4.settings = r6
            return
    }

    private void checkState(org.bson.json.StrictCharacterStreamJsonWriter.State r3) {
            r2 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = r2.state
            if (r0 != r3) goto L5
            return
        L5:
            org.bson.BsonInvalidOperationException r3 = new org.bson.BsonInvalidOperationException
            java.lang.String r0 = "Invalid state "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$State r1 = r2.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    private void preWriteValue() {
            r2 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$300(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.ARRAY
            if (r0 != r1) goto L3f
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$000(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = ","
            r2.write(r0)
        L17:
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r2.settings
            boolean r0 = r0.isIndent()
            if (r0 == 0) goto L32
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r2.settings
            java.lang.String r0 = r0.getNewLineCharacters()
            r2.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$100(r0)
            r2.write(r0)
            goto L3f
        L32:
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$000(r0)
            if (r0 == 0) goto L3f
            java.lang.String r0 = " "
            r2.write(r0)
        L3f:
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$002(r0)
            return
    }

    private void setNextState() {
            r2 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$300(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.ARRAY
            if (r0 != r1) goto Lf
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r2.state = r0
            goto L13
        Lf:
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.NAME
            r2.state = r0
        L13:
            return
    }

    private void throwBSONException(java.io.IOException r3) {
            r2 = this;
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "Wrapping IOException"
            r0.<init>(r1, r3)
            throw r0
    }

    private void write(char r4) {
            r3 = this;
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r3.settings     // Catch: java.io.IOException -> L22
            int r0 = r0.getMaxLength()     // Catch: java.io.IOException -> L22
            r1 = 1
            if (r0 == 0) goto L17
            int r0 = r3.curLength     // Catch: java.io.IOException -> L22
            org.bson.json.StrictCharacterStreamJsonWriterSettings r2 = r3.settings     // Catch: java.io.IOException -> L22
            int r2 = r2.getMaxLength()     // Catch: java.io.IOException -> L22
            if (r0 >= r2) goto L14
            goto L17
        L14:
            r3.isTruncated = r1     // Catch: java.io.IOException -> L22
            goto L26
        L17:
            java.io.Writer r0 = r3.writer     // Catch: java.io.IOException -> L22
            r0.write(r4)     // Catch: java.io.IOException -> L22
            int r4 = r3.curLength     // Catch: java.io.IOException -> L22
            int r4 = r4 + r1
            r3.curLength = r4     // Catch: java.io.IOException -> L22
            goto L26
        L22:
            r4 = move-exception
            r3.throwBSONException(r4)
        L26:
            return
    }

    private void write(java.lang.String r5) {
            r4 = this;
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r4.settings     // Catch: java.io.IOException -> L46
            int r0 = r0.getMaxLength()     // Catch: java.io.IOException -> L46
            if (r0 == 0) goto L37
            int r0 = r5.length()     // Catch: java.io.IOException -> L46
            int r1 = r4.curLength     // Catch: java.io.IOException -> L46
            int r0 = r0 + r1
            org.bson.json.StrictCharacterStreamJsonWriterSettings r1 = r4.settings     // Catch: java.io.IOException -> L46
            int r1 = r1.getMaxLength()     // Catch: java.io.IOException -> L46
            if (r0 >= r1) goto L18
            goto L37
        L18:
            java.io.Writer r0 = r4.writer     // Catch: java.io.IOException -> L46
            r1 = 0
            org.bson.json.StrictCharacterStreamJsonWriterSettings r2 = r4.settings     // Catch: java.io.IOException -> L46
            int r2 = r2.getMaxLength()     // Catch: java.io.IOException -> L46
            int r3 = r4.curLength     // Catch: java.io.IOException -> L46
            int r2 = r2 - r3
            java.lang.String r5 = r5.substring(r1, r2)     // Catch: java.io.IOException -> L46
            r0.write(r5)     // Catch: java.io.IOException -> L46
            org.bson.json.StrictCharacterStreamJsonWriterSettings r5 = r4.settings     // Catch: java.io.IOException -> L46
            int r5 = r5.getMaxLength()     // Catch: java.io.IOException -> L46
            r4.curLength = r5     // Catch: java.io.IOException -> L46
            r5 = 1
            r4.isTruncated = r5     // Catch: java.io.IOException -> L46
            goto L4a
        L37:
            java.io.Writer r0 = r4.writer     // Catch: java.io.IOException -> L46
            r0.write(r5)     // Catch: java.io.IOException -> L46
            int r0 = r4.curLength     // Catch: java.io.IOException -> L46
            int r5 = r5.length()     // Catch: java.io.IOException -> L46
            int r0 = r0 + r5
            r4.curLength = r0     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r5 = move-exception
            r4.throwBSONException(r5)
        L4a:
            return
    }

    private void writeStringHelper(java.lang.String r7) {
            r6 = this;
            r0 = 34
            r6.write(r0)
            r1 = 0
        L6:
            int r2 = r7.length()
            if (r1 >= r2) goto L9a
            char r2 = r7.charAt(r1)
            r3 = 12
            if (r2 == r3) goto L91
            r4 = 13
            if (r2 == r4) goto L8b
            if (r2 == r0) goto L85
            r4 = 92
            if (r2 == r4) goto L7f
            switch(r2) {
                case 8: goto L79;
                case 9: goto L73;
                case 10: goto L6d;
                default: goto L21;
            }
        L21:
            int r4 = java.lang.Character.getType(r2)
            r5 = 1
            if (r4 == r5) goto L69
            r5 = 2
            if (r4 == r5) goto L69
            r5 = 3
            if (r4 == r5) goto L69
            r5 = 5
            if (r4 == r5) goto L69
            switch(r4) {
                case 9: goto L69;
                case 10: goto L69;
                case 11: goto L69;
                case 12: goto L69;
                default: goto L34;
            }
        L34:
            switch(r4) {
                case 20: goto L69;
                case 21: goto L69;
                case 22: goto L69;
                case 23: goto L69;
                case 24: goto L69;
                case 25: goto L69;
                case 26: goto L69;
                case 27: goto L69;
                case 28: goto L69;
                case 29: goto L69;
                case 30: goto L69;
                default: goto L37;
            }
        L37:
            java.lang.String r4 = "\\u"
            r6.write(r4)
            r4 = 61440(0xf000, float:8.6096E-41)
            r4 = r4 & r2
            int r3 = r4 >> 12
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r6.write(r3)
            r3 = r2 & 3840(0xf00, float:5.381E-42)
            int r3 = r3 >> 8
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r6.write(r3)
            r3 = r2 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> 4
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r6.write(r3)
            r2 = r2 & 15
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r6.write(r2)
            goto L96
        L69:
            r6.write(r2)
            goto L96
        L6d:
            java.lang.String r2 = "\\n"
            r6.write(r2)
            goto L96
        L73:
            java.lang.String r2 = "\\t"
            r6.write(r2)
            goto L96
        L79:
            java.lang.String r2 = "\\b"
            r6.write(r2)
            goto L96
        L7f:
            java.lang.String r2 = "\\\\"
            r6.write(r2)
            goto L96
        L85:
            java.lang.String r2 = "\\\""
            r6.write(r2)
            goto L96
        L8b:
            java.lang.String r2 = "\\r"
            r6.write(r2)
            goto L96
        L91:
            java.lang.String r2 = "\\f"
            r6.write(r2)
        L96:
            int r1 = r1 + 1
            goto L6
        L9a:
            r6.write(r0)
            return
    }

    public final void flush() {
            r1 = this;
            java.io.Writer r0 = r1.writer     // Catch: java.io.IOException -> L6
            r0.flush()     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r0 = move-exception
            r1.throwBSONException(r0)
        La:
            return
    }

    public int getCurrentLength() {
            r1 = this;
            int r0 = r1.curLength
            return r0
    }

    public final java.io.Writer getWriter() {
            r1 = this;
            java.io.Writer r0 = r1.writer
            return r0
    }

    @Override // org.bson.json.StrictJsonWriter
    public boolean isTruncated() {
            r1 = this;
            boolean r0 = r1.isTruncated
            return r0
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            r1.writeName(r2)
            r1.writeBoolean(r3)
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeBoolean(boolean r2) {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r1.checkState(r0)
            r1.preWriteValue()
            if (r2 == 0) goto Ld
            java.lang.String r2 = "true"
            goto Lf
        Ld:
            java.lang.String r2 = "false"
        Lf:
            r1.write(r2)
            r1.setNextState()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeEndArray() {
            r2 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r2.checkState(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$300(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.ARRAY
            if (r0 != r1) goto L53
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r2.settings
            boolean r0 = r0.isIndent()
            if (r0 == 0) goto L35
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$000(r0)
            if (r0 == 0) goto L35
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r2.settings
            java.lang.String r0 = r0.getNewLineCharacters()
            r2.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$200(r0)
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$100(r0)
            r2.write(r0)
        L35:
            java.lang.String r0 = "]"
            r2.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$200(r0)
            r2.context = r0
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$300(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.TOP_LEVEL
            if (r0 != r1) goto L4f
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.DONE
            r2.state = r0
            goto L52
        L4f:
            r2.setNextState()
        L52:
            return
        L53:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.String r1 = "Can't end an array if not in an array"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeEndObject() {
            r2 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.NAME
            r2.checkState(r0)
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r2.settings
            boolean r0 = r0.isIndent()
            if (r0 == 0) goto L2b
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$000(r0)
            if (r0 == 0) goto L2b
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r2.settings
            java.lang.String r0 = r0.getNewLineCharacters()
            r2.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$200(r0)
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$100(r0)
            r2.write(r0)
        L2b:
            java.lang.String r0 = "}"
            r2.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r2.context
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$200(r0)
            r2.context = r0
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$300(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r1 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.TOP_LEVEL
            if (r0 != r1) goto L45
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.DONE
            r2.state = r0
            goto L48
        L45:
            r2.setNextState()
        L48:
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.NAME
            r1.checkState(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r1.context
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$000(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = ","
            r1.write(r0)
        L17:
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r1.settings
            boolean r0 = r0.isIndent()
            if (r0 == 0) goto L32
            org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = r1.settings
            java.lang.String r0 = r0.getNewLineCharacters()
            r1.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r1.context
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$100(r0)
            r1.write(r0)
            goto L3f
        L32:
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = r1.context
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriter.StrictJsonContext.access$000(r0)
            if (r0 == 0) goto L3f
            java.lang.String r0 = " "
            r1.write(r0)
        L3f:
            r1.writeStringHelper(r2)
            java.lang.String r2 = ": "
            r1.write(r2)
            org.bson.json.StrictCharacterStreamJsonWriter$State r2 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r1.state = r2
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNull() {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r1.checkState(r0)
            r1.preWriteValue()
            java.lang.String r0 = "null"
            r1.write(r0)
            r1.setNextState()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNull(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeNull()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNumber(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r1.checkState(r0)
            r1.preWriteValue()
            r1.write(r2)
            r1.setNextState()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNumber(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeNumber(r3)
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeRaw(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r1.checkState(r0)
            r1.preWriteValue()
            r1.write(r2)
            r1.setNextState()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeRaw(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.writeName(r2)
            r1.writeRaw(r3)
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartArray() {
            r4 = this;
            r4.preWriteValue()
            java.lang.String r0 = "["
            r4.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = new org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r1 = r4.context
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r2 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.ARRAY
            org.bson.json.StrictCharacterStreamJsonWriterSettings r3 = r4.settings
            java.lang.String r3 = r3.getIndentCharacters()
            r0.<init>(r1, r2, r3)
            r4.context = r0
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r4.state = r0
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartArray(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeStartArray()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartObject() {
            r4 = this;
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = r4.state
            org.bson.json.StrictCharacterStreamJsonWriter$State r1 = org.bson.json.StrictCharacterStreamJsonWriter.State.INITIAL
            if (r0 == r1) goto L20
            org.bson.json.StrictCharacterStreamJsonWriter$State r1 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            if (r0 != r1) goto Lb
            goto L20
        Lb:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.String r1 = "Invalid state "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            org.bson.json.StrictCharacterStreamJsonWriter$State r2 = r4.state
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L20:
            r4.preWriteValue()
            java.lang.String r0 = "{"
            r4.write(r0)
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r0 = new org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext
            org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext r1 = r4.context
            org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType r2 = org.bson.json.StrictCharacterStreamJsonWriter.JsonContextType.DOCUMENT
            org.bson.json.StrictCharacterStreamJsonWriterSettings r3 = r4.settings
            java.lang.String r3 = r3.getIndentCharacters()
            r0.<init>(r1, r2, r3)
            r4.context = r0
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.NAME
            r4.state = r0
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartObject(java.lang.String r1) {
            r0 = this;
            r0.writeName(r1)
            r0.writeStartObject()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeString(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.json.StrictCharacterStreamJsonWriter$State r0 = org.bson.json.StrictCharacterStreamJsonWriter.State.VALUE
            r1.checkState(r0)
            r1.preWriteValue()
            r1.writeStringHelper(r2)
            r1.setNextState()
            return
    }

    @Override // org.bson.json.StrictJsonWriter
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
}
