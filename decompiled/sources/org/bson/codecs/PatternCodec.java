package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class PatternCodec implements org.bson.codecs.Codec<java.util.regex.Pattern> {
    private static final int GLOBAL_FLAG = 256;

    public static final enum RegexFlag extends java.lang.Enum<org.bson.codecs.PatternCodec.RegexFlag> {
        private static final /* synthetic */ org.bson.codecs.PatternCodec.RegexFlag[] $VALUES = null;
        private static final java.util.Map<java.lang.Character, org.bson.codecs.PatternCodec.RegexFlag> BY_CHARACTER = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag CANON_EQ = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag CASE_INSENSITIVE = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag COMMENTS = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag DOTALL = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag GLOBAL = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag LITERAL = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag MULTILINE = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag UNICODE_CASE = null;
        public static final org.bson.codecs.PatternCodec.RegexFlag UNIX_LINES = null;
        private final char flagChar;
        private final int javaFlag;
        private final java.lang.String unsupported;

        static {
                org.bson.codecs.PatternCodec$RegexFlag r6 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r1 = "CANON_EQ"
                r2 = 0
                r3 = 128(0x80, float:1.8E-43)
                r4 = 99
                java.lang.String r5 = "Pattern.CANON_EQ"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                org.bson.codecs.PatternCodec.RegexFlag.CANON_EQ = r6
                org.bson.codecs.PatternCodec$RegexFlag r0 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r8 = "UNIX_LINES"
                r9 = 1
                r10 = 1
                r11 = 100
                java.lang.String r12 = "Pattern.UNIX_LINES"
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                org.bson.codecs.PatternCodec.RegexFlag.UNIX_LINES = r0
                org.bson.codecs.PatternCodec$RegexFlag r1 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r14 = "GLOBAL"
                r15 = 2
                r16 = 256(0x100, float:3.59E-43)
                r17 = 103(0x67, float:1.44E-43)
                r18 = 0
                r13 = r1
                r13.<init>(r14, r15, r16, r17, r18)
                org.bson.codecs.PatternCodec.RegexFlag.GLOBAL = r1
                org.bson.codecs.PatternCodec$RegexFlag r2 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r8 = "CASE_INSENSITIVE"
                r9 = 3
                r10 = 2
                r11 = 105(0x69, float:1.47E-43)
                r12 = 0
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
                org.bson.codecs.PatternCodec.RegexFlag.CASE_INSENSITIVE = r2
                org.bson.codecs.PatternCodec$RegexFlag r3 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r14 = "MULTILINE"
                r15 = 4
                r16 = 8
                r17 = 109(0x6d, float:1.53E-43)
                r13 = r3
                r13.<init>(r14, r15, r16, r17, r18)
                org.bson.codecs.PatternCodec.RegexFlag.MULTILINE = r3
                org.bson.codecs.PatternCodec$RegexFlag r4 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r8 = "DOTALL"
                r9 = 5
                r10 = 32
                r11 = 115(0x73, float:1.61E-43)
                java.lang.String r12 = "Pattern.DOTALL"
                r7 = r4
                r7.<init>(r8, r9, r10, r11, r12)
                org.bson.codecs.PatternCodec.RegexFlag.DOTALL = r4
                org.bson.codecs.PatternCodec$RegexFlag r5 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r14 = "LITERAL"
                r15 = 6
                r16 = 16
                r17 = 116(0x74, float:1.63E-43)
                java.lang.String r18 = "Pattern.LITERAL"
                r13 = r5
                r13.<init>(r14, r15, r16, r17, r18)
                org.bson.codecs.PatternCodec.RegexFlag.LITERAL = r5
                org.bson.codecs.PatternCodec$RegexFlag r13 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r8 = "UNICODE_CASE"
                r9 = 7
                r10 = 64
                r11 = 117(0x75, float:1.64E-43)
                java.lang.String r12 = "Pattern.UNICODE_CASE"
                r7 = r13
                r7.<init>(r8, r9, r10, r11, r12)
                org.bson.codecs.PatternCodec.RegexFlag.UNICODE_CASE = r13
                org.bson.codecs.PatternCodec$RegexFlag r7 = new org.bson.codecs.PatternCodec$RegexFlag
                java.lang.String r15 = "COMMENTS"
                r16 = 8
                r17 = 4
                r18 = 120(0x78, float:1.68E-43)
                r19 = 0
                r14 = r7
                r14.<init>(r15, r16, r17, r18, r19)
                org.bson.codecs.PatternCodec.RegexFlag.COMMENTS = r7
                r8 = 9
                org.bson.codecs.PatternCodec$RegexFlag[] r8 = new org.bson.codecs.PatternCodec.RegexFlag[r8]
                r9 = 0
                r8[r9] = r6
                r6 = 1
                r8[r6] = r0
                r0 = 2
                r8[r0] = r1
                r0 = 3
                r8[r0] = r2
                r0 = 4
                r8[r0] = r3
                r0 = 5
                r8[r0] = r4
                r0 = 6
                r8[r0] = r5
                r0 = 7
                r8[r0] = r13
                r0 = 8
                r8[r0] = r7
                org.bson.codecs.PatternCodec.RegexFlag.$VALUES = r8
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                org.bson.codecs.PatternCodec.RegexFlag.BY_CHARACTER = r0
                org.bson.codecs.PatternCodec$RegexFlag[] r0 = values()
                int r1 = r0.length
            Lc3:
                if (r9 >= r1) goto Ld5
                r2 = r0[r9]
                java.util.Map<java.lang.Character, org.bson.codecs.PatternCodec$RegexFlag> r3 = org.bson.codecs.PatternCodec.RegexFlag.BY_CHARACTER
                char r4 = r2.flagChar
                java.lang.Character r4 = java.lang.Character.valueOf(r4)
                r3.put(r4, r2)
                int r9 = r9 + 1
                goto Lc3
            Ld5:
                return
        }

        private RegexFlag(java.lang.String r1, int r2, int r3, char r4, java.lang.String r5) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.javaFlag = r3
                r0.flagChar = r4
                r0.unsupported = r5
                return
        }

        public static /* synthetic */ int access$000(org.bson.codecs.PatternCodec.RegexFlag r0) {
                int r0 = r0.javaFlag
                return r0
        }

        public static /* synthetic */ char access$100(org.bson.codecs.PatternCodec.RegexFlag r0) {
                char r0 = r0.flagChar
                return r0
        }

        public static /* synthetic */ java.lang.String access$200(org.bson.codecs.PatternCodec.RegexFlag r0) {
                java.lang.String r0 = r0.unsupported
                return r0
        }

        public static org.bson.codecs.PatternCodec.RegexFlag getByCharacter(char r1) {
                java.util.Map<java.lang.Character, org.bson.codecs.PatternCodec$RegexFlag> r0 = org.bson.codecs.PatternCodec.RegexFlag.BY_CHARACTER
                java.lang.Character r1 = java.lang.Character.valueOf(r1)
                java.lang.Object r1 = r0.get(r1)
                org.bson.codecs.PatternCodec$RegexFlag r1 = (org.bson.codecs.PatternCodec.RegexFlag) r1
                return r1
        }

        public static org.bson.codecs.PatternCodec.RegexFlag valueOf(java.lang.String r1) {
                java.lang.Class<org.bson.codecs.PatternCodec$RegexFlag> r0 = org.bson.codecs.PatternCodec.RegexFlag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.bson.codecs.PatternCodec$RegexFlag r1 = (org.bson.codecs.PatternCodec.RegexFlag) r1
                return r1
        }

        public static org.bson.codecs.PatternCodec.RegexFlag[] values() {
                org.bson.codecs.PatternCodec$RegexFlag[] r0 = org.bson.codecs.PatternCodec.RegexFlag.$VALUES
                java.lang.Object r0 = r0.clone()
                org.bson.codecs.PatternCodec$RegexFlag[] r0 = (org.bson.codecs.PatternCodec.RegexFlag[]) r0
                return r0
        }
    }

    public PatternCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getOptionsAsInt(org.bson.BsonRegularExpression r4) {
            java.lang.String r4 = r4.getOptions()
            r0 = 0
            if (r4 == 0) goto L53
            int r1 = r4.length()
            if (r1 != 0) goto Le
            goto L53
        Le:
            java.lang.String r4 = r4.toLowerCase()
            r1 = 0
        L13:
            int r2 = r4.length()
            if (r0 >= r2) goto L52
            char r2 = r4.charAt(r0)
            org.bson.codecs.PatternCodec$RegexFlag r2 = org.bson.codecs.PatternCodec.RegexFlag.getByCharacter(r2)
            if (r2 == 0) goto L2e
            int r3 = org.bson.codecs.PatternCodec.RegexFlag.access$000(r2)
            r1 = r1 | r3
            org.bson.codecs.PatternCodec.RegexFlag.access$200(r2)
            int r0 = r0 + 1
            goto L13
        L2e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unrecognized flag ["
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            char r3 = r4.charAt(r0)
            r2.append(r3)
            java.lang.String r3 = "] "
            r2.append(r3)
            char r4 = r4.charAt(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L52:
            return r1
        L53:
            return r0
    }

    private static java.lang.String getOptionsAsString(java.util.regex.Pattern r8) {
            int r0 = r8.flags()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            org.bson.codecs.PatternCodec$RegexFlag[] r2 = org.bson.codecs.PatternCodec.RegexFlag.values()
            int r3 = r2.length
            r4 = 0
        Lf:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]
            int r6 = r8.flags()
            int r7 = org.bson.codecs.PatternCodec.RegexFlag.access$000(r5)
            r6 = r6 & r7
            if (r6 <= 0) goto L2a
            char r6 = org.bson.codecs.PatternCodec.RegexFlag.access$100(r5)
            r1.append(r6)
            int r5 = org.bson.codecs.PatternCodec.RegexFlag.access$000(r5)
            int r0 = r0 - r5
        L2a:
            int r4 = r4 + 1
            goto Lf
        L2d:
            if (r0 > 0) goto L34
            java.lang.String r8 = r1.toString()
            return r8
        L34:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "some flags could not be recognized."
            r8.<init>(r0)
            throw r8
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.regex.Pattern r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.regex.Pattern decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonRegularExpression r1 = r1.readRegularExpression()
            java.lang.String r2 = r1.getPattern()
            int r1 = getOptionsAsInt(r1)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r2, r1)
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r2, java.util.regex.Pattern r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            org.bson.BsonRegularExpression r4 = new org.bson.BsonRegularExpression
            java.lang.String r0 = r3.pattern()
            java.lang.String r3 = getOptionsAsString(r3)
            r4.<init>(r0, r3)
            r2.writeRegularExpression(r4)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.regex.Pattern> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.regex.Pattern> r0 = java.util.regex.Pattern.class
            return r0
    }
}
