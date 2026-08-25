package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public abstract class BaseEncoding {
    private static final com.google.common.io.BaseEncoding BASE16 = null;
    private static final com.google.common.io.BaseEncoding BASE32 = null;
    private static final com.google.common.io.BaseEncoding BASE32_HEX = null;
    private static final com.google.common.io.BaseEncoding BASE64 = null;
    private static final com.google.common.io.BaseEncoding BASE64_URL = null;




    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass4 implements java.lang.Appendable {
        public int charsUntilSeparator;
        public final /* synthetic */ int val$afterEveryChars;
        public final /* synthetic */ java.lang.Appendable val$delegate;
        public final /* synthetic */ java.lang.String val$separator;

        public AnonymousClass4(int r1, java.lang.Appendable r2, java.lang.String r3) {
                r0 = this;
                r0.val$afterEveryChars = r1
                r0.val$delegate = r2
                r0.val$separator = r3
                r0.<init>()
                r0.charsUntilSeparator = r1
                return
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(char r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.charsUntilSeparator
                if (r0 != 0) goto Lf
                java.lang.Appendable r0 = r2.val$delegate
                java.lang.String r1 = r2.val$separator
                r0.append(r1)
                int r0 = r2.val$afterEveryChars
                r2.charsUntilSeparator = r0
            Lf:
                java.lang.Appendable r0 = r2.val$delegate
                r0.append(r3)
                int r3 = r2.charsUntilSeparator
                int r3 = r3 + (-1)
                r2.charsUntilSeparator = r3
                return r2
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(@javax.annotation.CheckForNull java.lang.CharSequence r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(@javax.annotation.CheckForNull java.lang.CharSequence r1, int r2, int r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }


    public static final class Alphabet {
        public final int bitsPerChar;
        public final int bytesPerChunk;
        private final char[] chars;
        public final int charsPerChunk;
        private final byte[] decodabet;
        public final int mask;
        private final java.lang.String name;
        private final boolean[] validPadding;

        public Alphabet(java.lang.String r9, char[] r10) {
                r8 = this;
                r8.<init>()
                java.lang.Object r9 = com.google.common.base.Preconditions.checkNotNull(r9)
                java.lang.String r9 = (java.lang.String) r9
                r8.name = r9
                java.lang.Object r9 = com.google.common.base.Preconditions.checkNotNull(r10)
                char[] r9 = (char[]) r9
                r8.chars = r9
                int r9 = r10.length     // Catch: java.lang.ArithmeticException -> L96
                java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L96
                int r9 = com.google.common.math.IntMath.log2(r9, r0)     // Catch: java.lang.ArithmeticException -> L96
                r8.bitsPerChar = r9     // Catch: java.lang.ArithmeticException -> L96
                int r0 = java.lang.Integer.lowestOneBit(r9)
                r1 = 8
                int r0 = java.lang.Math.min(r1, r0)
                int r1 = r1 / r0
                r8.charsPerChunk = r1     // Catch: java.lang.ArithmeticException -> L78
                int r9 = r9 / r0
                r8.bytesPerChunk = r9     // Catch: java.lang.ArithmeticException -> L78
                int r9 = r10.length
                r0 = 1
                int r9 = r9 - r0
                r8.mask = r9
                r9 = 128(0x80, float:1.8E-43)
                byte[] r1 = new byte[r9]
                r2 = -1
                java.util.Arrays.fill(r1, r2)
                r3 = 0
                r4 = 0
            L3b:
                int r5 = r10.length
                if (r4 >= r5) goto L5c
                char r5 = r10[r4]
                if (r5 >= r9) goto L44
                r6 = 1
                goto L45
            L44:
                r6 = 0
            L45:
                java.lang.String r7 = "Non-ASCII character: %s"
                com.google.common.base.Preconditions.checkArgument(r6, r7, r5)
                r6 = r1[r5]
                if (r6 != r2) goto L50
                r6 = 1
                goto L51
            L50:
                r6 = 0
            L51:
                java.lang.String r7 = "Duplicate character: %s"
                com.google.common.base.Preconditions.checkArgument(r6, r7, r5)
                byte r6 = (byte) r4
                r1[r5] = r6
                int r4 = r4 + 1
                goto L3b
            L5c:
                r8.decodabet = r1
                int r9 = r8.charsPerChunk
                boolean[] r9 = new boolean[r9]
            L62:
                int r10 = r8.bytesPerChunk
                if (r3 >= r10) goto L75
                int r10 = r3 * 8
                int r1 = r8.bitsPerChar
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r10 = com.google.common.math.IntMath.divide(r10, r1, r2)
                r9[r10] = r0
                int r3 = r3 + 1
                goto L62
            L75:
                r8.validPadding = r9
                return
            L78:
                r9 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Illegal alphabet "
                java.lang.String r2 = new java.lang.String
                r2.<init>(r10)
                int r10 = r2.length()
                if (r10 == 0) goto L8d
                java.lang.String r10 = r1.concat(r2)
                goto L92
            L8d:
                java.lang.String r10 = new java.lang.String
                r10.<init>(r1)
            L92:
                r0.<init>(r10, r9)
                throw r0
            L96:
                r9 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r10 = r10.length
                r1 = 35
                java.lang.String r2 = "Illegal alphabet length "
                java.lang.String r10 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r10)
                r0.<init>(r10, r9)
                throw r0
        }

        public static /* synthetic */ char[] access$000(com.google.common.io.BaseEncoding.Alphabet r0) {
                char[] r0 = r0.chars
                return r0
        }

        private boolean hasLowerCase() {
                r5 = this;
                char[] r0 = r5.chars
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                char r4 = r0[r3]
                boolean r4 = com.google.common.base.Ascii.isLowerCase(r4)
                if (r4 == 0) goto L11
                r0 = 1
                return r0
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        private boolean hasUpperCase() {
                r5 = this;
                char[] r0 = r5.chars
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                char r4 = r0[r3]
                boolean r4 = com.google.common.base.Ascii.isUpperCase(r4)
                if (r4 == 0) goto L11
                r0 = 1
                return r0
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        public final boolean canDecode(char r2) {
                r1 = this;
                r0 = 127(0x7f, float:1.78E-43)
                if (r2 > r0) goto Ld
                byte[] r0 = r1.decodabet
                r2 = r0[r2]
                r0 = -1
                if (r2 == r0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        public final int decode(char r5) throws com.google.common.io.BaseEncoding.DecodingException {
                r4 = this;
                java.lang.String r0 = "Unrecognized character: 0x"
                r1 = 127(0x7f, float:1.78E-43)
                if (r5 <= r1) goto L24
                com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                java.lang.String r5 = java.lang.String.valueOf(r5)
                int r2 = r5.length()
                if (r2 == 0) goto L1b
                java.lang.String r5 = r0.concat(r5)
                goto L20
            L1b:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0)
            L20:
                r1.<init>(r5)
                throw r1
            L24:
                byte[] r2 = r4.decodabet
                r2 = r2[r5]
                r3 = -1
                if (r2 != r3) goto L69
                r2 = 32
                if (r5 <= r2) goto L4b
                if (r5 != r1) goto L32
                goto L4b
            L32:
                com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                r1 = 25
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Unrecognized character: "
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.<init>(r5)
                throw r0
            L4b:
                com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                java.lang.String r5 = java.lang.String.valueOf(r5)
                int r2 = r5.length()
                if (r2 == 0) goto L60
                java.lang.String r5 = r0.concat(r5)
                goto L65
            L60:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0)
            L65:
                r1.<init>(r5)
                throw r1
            L69:
                return r2
        }

        public final char encode(int r2) {
                r1 = this;
                char[] r0 = r1.chars
                char r2 = r0[r2]
                return r2
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.io.BaseEncoding.Alphabet
                if (r0 == 0) goto Lf
                com.google.common.io.BaseEncoding$Alphabet r2 = (com.google.common.io.BaseEncoding.Alphabet) r2
                char[] r0 = r1.chars
                char[] r2 = r2.chars
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                char[] r0 = r1.chars
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public final boolean isValidPaddingStartPosition(int r3) {
                r2 = this;
                boolean[] r0 = r2.validPadding
                int r1 = r2.charsPerChunk
                int r3 = r3 % r1
                boolean r3 = r0[r3]
                return r3
        }

        public final com.google.common.io.BaseEncoding.Alphabet lowerCase() {
                r4 = this;
                boolean r0 = r4.hasUpperCase()
                if (r0 != 0) goto L7
                return r4
            L7:
                boolean r0 = r4.hasLowerCase()
                r0 = r0 ^ 1
                java.lang.String r1 = "Cannot call lowerCase() on a mixed-case alphabet"
                com.google.common.base.Preconditions.checkState(r0, r1)
                char[] r0 = r4.chars
                int r0 = r0.length
                char[] r0 = new char[r0]
                r1 = 0
            L18:
                char[] r2 = r4.chars
                int r3 = r2.length
                if (r1 >= r3) goto L28
                char r2 = r2[r1]
                char r2 = com.google.common.base.Ascii.toLowerCase(r2)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L18
            L28:
                com.google.common.io.BaseEncoding$Alphabet r1 = new com.google.common.io.BaseEncoding$Alphabet
                java.lang.String r2 = r4.name
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r3 = ".lowerCase()"
                java.lang.String r2 = r2.concat(r3)
                r1.<init>(r2, r0)
                return r1
        }

        public boolean matches(char r3) {
                r2 = this;
                byte[] r0 = r2.decodabet
                int r1 = r0.length
                if (r3 >= r1) goto Lc
                r3 = r0[r3]
                r0 = -1
                if (r3 == r0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                return r3
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public final com.google.common.io.BaseEncoding.Alphabet upperCase() {
                r4 = this;
                boolean r0 = r4.hasLowerCase()
                if (r0 != 0) goto L7
                return r4
            L7:
                boolean r0 = r4.hasUpperCase()
                r0 = r0 ^ 1
                java.lang.String r1 = "Cannot call upperCase() on a mixed-case alphabet"
                com.google.common.base.Preconditions.checkState(r0, r1)
                char[] r0 = r4.chars
                int r0 = r0.length
                char[] r0 = new char[r0]
                r1 = 0
            L18:
                char[] r2 = r4.chars
                int r3 = r2.length
                if (r1 >= r3) goto L28
                char r2 = r2[r1]
                char r2 = com.google.common.base.Ascii.toUpperCase(r2)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L18
            L28:
                com.google.common.io.BaseEncoding$Alphabet r1 = new com.google.common.io.BaseEncoding$Alphabet
                java.lang.String r2 = r4.name
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r3 = ".upperCase()"
                java.lang.String r2 = r2.concat(r3)
                r1.<init>(r2, r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Base16Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        public final char[] encoding;

        public Base16Encoding() {
                r3 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                java.lang.String r1 = "0123456789ABCDEF"
                char[] r1 = r1.toCharArray()
                java.lang.String r2 = "base16()"
                r0.<init>(r2, r1)
                r3.<init>(r0)
                return
        }

        private Base16Encoding(com.google.common.io.BaseEncoding.Alphabet r5) {
                r4 = this;
                r0 = 0
                r4.<init>(r5, r0)
                r0 = 512(0x200, float:7.17E-43)
                char[] r0 = new char[r0]
                r4.encoding = r0
                char[] r0 = com.google.common.io.BaseEncoding.Alphabet.access$000(r5)
                int r0 = r0.length
                r1 = 0
                r2 = 16
                if (r0 != r2) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                com.google.common.base.Preconditions.checkArgument(r0)
            L1a:
                r0 = 256(0x100, float:3.59E-43)
                if (r1 >= r0) goto L37
                char[] r0 = r4.encoding
                int r2 = r1 >>> 4
                char r2 = r5.encode(r2)
                r0[r1] = r2
                char[] r0 = r4.encoding
                r2 = r1 | 256(0x100, float:3.59E-43)
                r3 = r1 & 15
                char r3 = r5.encode(r3)
                r0[r2] = r3
                int r1 = r1 + 1
                goto L1a
            L37:
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final int decodeTo(byte[] r6, java.lang.CharSequence r7) throws com.google.common.io.BaseEncoding.DecodingException {
                r5 = this;
                com.google.common.base.Preconditions.checkNotNull(r6)
                int r0 = r7.length()
                int r0 = r0 % 2
                r1 = 1
                if (r0 == r1) goto L37
                r0 = 0
                r1 = 0
            Le:
                int r2 = r7.length()
                if (r0 >= r2) goto L36
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                char r3 = r7.charAt(r0)
                int r2 = r2.decode(r3)
                int r2 = r2 << 4
                com.google.common.io.BaseEncoding$Alphabet r3 = r5.alphabet
                int r4 = r0 + 1
                char r4 = r7.charAt(r4)
                int r3 = r3.decode(r4)
                r2 = r2 | r3
                int r3 = r1 + 1
                byte r2 = (byte) r2
                r6[r1] = r2
                int r0 = r0 + 2
                r1 = r3
                goto Le
            L36:
                return r1
            L37:
                com.google.common.io.BaseEncoding$DecodingException r6 = new com.google.common.io.BaseEncoding$DecodingException
                int r7 = r7.length()
                r0 = 32
                java.lang.String r1 = "Invalid input length "
                java.lang.String r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r7)
                r6.<init>(r7)
                throw r6
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final void encodeTo(java.lang.Appendable r4, byte[] r5, int r6, int r7) throws java.io.IOException {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                int r0 = r6 + r7
                int r1 = r5.length
                com.google.common.base.Preconditions.checkPositionIndexes(r6, r0, r1)
                r0 = 0
            La:
                if (r0 >= r7) goto L25
                int r1 = r6 + r0
                r1 = r5[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                char[] r2 = r3.encoding
                char r2 = r2[r1]
                r4.append(r2)
                char[] r2 = r3.encoding
                r1 = r1 | 256(0x100, float:3.59E-43)
                char r1 = r2[r1]
                r4.append(r1)
                int r0 = r0 + 1
                goto La
            L25:
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public final com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet r1, @javax.annotation.CheckForNull java.lang.Character r2) {
                r0 = this;
                com.google.common.io.BaseEncoding$Base16Encoding r2 = new com.google.common.io.BaseEncoding$Base16Encoding
                r2.<init>(r1)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Base64Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        private Base64Encoding(com.google.common.io.BaseEncoding.Alphabet r1, @javax.annotation.CheckForNull java.lang.Character r2) {
                r0 = this;
                r0.<init>(r1, r2)
                char[] r1 = com.google.common.io.BaseEncoding.Alphabet.access$000(r1)
                int r1 = r1.length
                r2 = 64
                if (r1 != r2) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                com.google.common.base.Preconditions.checkArgument(r1)
                return
        }

        public Base64Encoding(java.lang.String r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Character r4) {
                r1 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final int decodeTo(byte[] r6, java.lang.CharSequence r7) throws com.google.common.io.BaseEncoding.DecodingException {
                r5 = this;
                com.google.common.base.Preconditions.checkNotNull(r6)
                java.lang.CharSequence r7 = r5.trimTrailingPadding(r7)
                com.google.common.io.BaseEncoding$Alphabet r0 = r5.alphabet
                int r1 = r7.length()
                boolean r0 = r0.isValidPaddingStartPosition(r1)
                if (r0 == 0) goto L7e
                r0 = 0
                r1 = 0
            L15:
                int r2 = r7.length()
                if (r0 >= r2) goto L7d
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                int r3 = r0 + 1
                char r0 = r7.charAt(r0)
                int r0 = r2.decode(r0)
                int r0 = r0 << 18
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                int r4 = r3 + 1
                char r3 = r7.charAt(r3)
                int r2 = r2.decode(r3)
                int r2 = r2 << 12
                r0 = r0 | r2
                int r2 = r1 + 1
                int r3 = r0 >>> 16
                byte r3 = (byte) r3
                r6[r1] = r3
                int r1 = r7.length()
                if (r4 >= r1) goto L7a
                com.google.common.io.BaseEncoding$Alphabet r1 = r5.alphabet
                int r3 = r4 + 1
                char r4 = r7.charAt(r4)
                int r1 = r1.decode(r4)
                int r1 = r1 << 6
                r0 = r0 | r1
                int r1 = r2 + 1
                int r4 = r0 >>> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r6[r2] = r4
                int r2 = r7.length()
                if (r3 >= r2) goto L78
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                int r4 = r3 + 1
                char r3 = r7.charAt(r3)
                int r2 = r2.decode(r3)
                r0 = r0 | r2
                int r2 = r1 + 1
                r0 = r0 & 255(0xff, float:3.57E-43)
                byte r0 = (byte) r0
                r6[r1] = r0
                goto L7a
            L78:
                r0 = r3
                goto L15
            L7a:
                r1 = r2
                r0 = r4
                goto L15
            L7d:
                return r1
            L7e:
                com.google.common.io.BaseEncoding$DecodingException r6 = new com.google.common.io.BaseEncoding$DecodingException
                int r7 = r7.length()
                r0 = 32
                java.lang.String r1 = "Invalid input length "
                java.lang.String r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r7)
                r6.<init>(r7)
                throw r6
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final void encodeTo(java.lang.Appendable r5, byte[] r6, int r7, int r8) throws java.io.IOException {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                int r0 = r7 + r8
                int r1 = r6.length
                com.google.common.base.Preconditions.checkPositionIndexes(r7, r0, r1)
            L9:
                r1 = 3
                if (r8 < r1) goto L58
                int r1 = r7 + 1
                r7 = r6[r7]
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r7 = r7 << 16
                int r2 = r1 + 1
                r1 = r6[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r7 = r7 | r1
                int r1 = r2 + 1
                r2 = r6[r2]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r7 = r7 | r2
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r3 = r7 >>> 18
                char r2 = r2.encode(r3)
                r5.append(r2)
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r3 = r7 >>> 12
                r3 = r3 & 63
                char r2 = r2.encode(r3)
                r5.append(r2)
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r3 = r7 >>> 6
                r3 = r3 & 63
                char r2 = r2.encode(r3)
                r5.append(r2)
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                r7 = r7 & 63
                char r7 = r2.encode(r7)
                r5.append(r7)
                int r8 = r8 + (-3)
                r7 = r1
                goto L9
            L58:
                if (r7 >= r0) goto L5e
                int r0 = r0 - r7
                r4.encodeChunkTo(r5, r6, r7, r0)
            L5e:
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public final com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet r2, @javax.annotation.CheckForNull java.lang.Character r3) {
                r1 = this;
                com.google.common.io.BaseEncoding$Base64Encoding r0 = new com.google.common.io.BaseEncoding$Base64Encoding
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class DecodingException extends java.io.IOException {
        public DecodingException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static final class SeparatedBaseEncoding extends com.google.common.io.BaseEncoding {
        private final int afterEveryChars;
        private final com.google.common.io.BaseEncoding delegate;
        private final java.lang.String separator;

        public SeparatedBaseEncoding(com.google.common.io.BaseEncoding r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.io.BaseEncoding r1 = (com.google.common.io.BaseEncoding) r1
                r0.delegate = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r1 = (java.lang.String) r1
                r0.separator = r1
                r0.afterEveryChars = r3
                if (r3 <= 0) goto L19
                r1 = 1
                goto L1a
            L19:
                r1 = 0
            L1a:
                java.lang.String r2 = "Cannot add a separator after every %s chars"
                com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
                return
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L6:
                int r2 = r5.length()
                if (r1 >= r2) goto L1e
                char r2 = r5.charAt(r1)
                java.lang.String r3 = r4.separator
                int r3 = r3.indexOf(r2)
                if (r3 >= 0) goto L1b
                r0.append(r2)
            L1b:
                int r1 = r1 + 1
                goto L6
            L1e:
                com.google.common.io.BaseEncoding r5 = r4.delegate
                boolean r5 = r5.canDecode(r0)
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        public final int decodeTo(byte[] r5, java.lang.CharSequence r6) throws com.google.common.io.BaseEncoding.DecodingException {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r6.length()
                r0.<init>(r1)
                r1 = 0
            La:
                int r2 = r6.length()
                if (r1 >= r2) goto L22
                char r2 = r6.charAt(r1)
                java.lang.String r3 = r4.separator
                int r3 = r3.indexOf(r2)
                if (r3 >= 0) goto L1f
                r0.append(r2)
            L1f:
                int r1 = r1 + 1
                goto La
            L22:
                com.google.common.io.BaseEncoding r6 = r4.delegate
                int r5 = r6.decodeTo(r5, r0)
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.InputStream decodingStream(java.io.Reader r4) {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                java.lang.String r1 = r3.separator
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.io.BaseEncoding$3 r2 = new com.google.common.io.BaseEncoding$3
                r2.<init>(r4, r1)
                java.io.InputStream r4 = r0.decodingStream(r2)
                return r4
        }

        @Override // com.google.common.io.BaseEncoding
        public final void encodeTo(java.lang.Appendable r5, byte[] r6, int r7, int r8) throws java.io.IOException {
                r4 = this;
                com.google.common.io.BaseEncoding r0 = r4.delegate
                java.lang.String r1 = r4.separator
                int r2 = r4.afterEveryChars
                com.google.common.base.Preconditions.checkNotNull(r5)
                com.google.common.base.Preconditions.checkNotNull(r1)
                if (r2 <= 0) goto L10
                r3 = 1
                goto L11
            L10:
                r3 = 0
            L11:
                com.google.common.base.Preconditions.checkArgument(r3)
                com.google.common.io.BaseEncoding$4 r3 = new com.google.common.io.BaseEncoding$4
                r3.<init>(r2, r5, r1)
                r0.encodeTo(r3, r6, r7, r8)
                return
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.OutputStream encodingStream(java.io.Writer r5) {
                r4 = this;
                com.google.common.io.BaseEncoding r0 = r4.delegate
                java.lang.String r1 = r4.separator
                int r2 = r4.afterEveryChars
                com.google.common.base.Preconditions.checkNotNull(r5)
                com.google.common.base.Preconditions.checkNotNull(r1)
                if (r2 <= 0) goto L10
                r3 = 1
                goto L11
            L10:
                r3 = 0
            L11:
                com.google.common.base.Preconditions.checkArgument(r3)
                com.google.common.io.BaseEncoding$4 r3 = new com.google.common.io.BaseEncoding$4
                r3.<init>(r2, r5, r1)
                com.google.common.io.BaseEncoding$5 r1 = new com.google.common.io.BaseEncoding$5
                r1.<init>(r3, r5)
                java.io.OutputStream r5 = r0.encodingStream(r1)
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                com.google.common.io.BaseEncoding r0 = r0.lowerCase()
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                com.google.common.io.BaseEncoding r0 = r0.withSeparator(r1, r2)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public final int maxDecodedSize(int r2) {
                r1 = this;
                com.google.common.io.BaseEncoding r0 = r1.delegate
                int r2 = r0.maxDecodedSize(r2)
                return r2
        }

        @Override // com.google.common.io.BaseEncoding
        public final int maxEncodedSize(int r5) {
                r4 = this;
                com.google.common.io.BaseEncoding r0 = r4.delegate
                int r5 = r0.maxEncodedSize(r5)
                java.lang.String r0 = r4.separator
                int r0 = r0.length()
                int r1 = r5 + (-1)
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                int r2 = r4.afterEveryChars
                java.math.RoundingMode r3 = java.math.RoundingMode.FLOOR
                int r1 = com.google.common.math.IntMath.divide(r1, r2, r3)
                int r1 = r1 * r0
                int r1 = r1 + r5
                return r1
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                com.google.common.io.BaseEncoding r0 = r0.omitPadding()
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                com.google.common.io.BaseEncoding r0 = r0.withSeparator(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r6 = this;
                com.google.common.io.BaseEncoding r0 = r6.delegate
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = r6.separator
                int r2 = r6.afterEveryChars
                int r3 = r0.length()
                int r3 = r3 + 31
                int r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r3)
                java.lang.String r4 = ".withSeparator(\""
                java.lang.String r5 = "\", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r0, r4, r1, r5)
                java.lang.String r1 = ")"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public final java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence r2) {
                r1 = this;
                com.google.common.io.BaseEncoding r0 = r1.delegate
                java.lang.CharSequence r2 = r0.trimTrailingPadding(r2)
                return r2
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                com.google.common.io.BaseEncoding r0 = r0.upperCase()
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                com.google.common.io.BaseEncoding r0 = r0.withSeparator(r1, r2)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char r3) {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.delegate
                com.google.common.io.BaseEncoding r3 = r0.withPadChar(r3)
                java.lang.String r0 = r2.separator
                int r1 = r2.afterEveryChars
                com.google.common.io.BaseEncoding r3 = r3.withSeparator(r0, r1)
                return r3
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Already have a separator"
                r1.<init>(r2)
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class StandardBaseEncoding extends com.google.common.io.BaseEncoding {
        public final com.google.common.io.BaseEncoding.Alphabet alphabet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient com.google.common.io.BaseEncoding lowerCase;

        @javax.annotation.CheckForNull
        public final java.lang.Character paddingChar;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient com.google.common.io.BaseEncoding upperCase;



        public StandardBaseEncoding(com.google.common.io.BaseEncoding.Alphabet r2, @javax.annotation.CheckForNull java.lang.Character r3) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.io.BaseEncoding$Alphabet r0 = (com.google.common.io.BaseEncoding.Alphabet) r0
                r1.alphabet = r0
                if (r3 == 0) goto L1a
                char r0 = r3.charValue()
                boolean r2 = r2.matches(r0)
                if (r2 != 0) goto L18
                goto L1a
            L18:
                r2 = 0
                goto L1b
            L1a:
                r2 = 1
            L1b:
                java.lang.String r0 = "Padding character %s was already in alphabet"
                com.google.common.base.Preconditions.checkArgument(r2, r0, r3)
                r1.paddingChar = r3
                return
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence r5) {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.CharSequence r5 = r4.trimTrailingPadding(r5)
                com.google.common.io.BaseEncoding$Alphabet r0 = r4.alphabet
                int r1 = r5.length()
                boolean r0 = r0.isValidPaddingStartPosition(r1)
                r1 = 0
                if (r0 != 0) goto L15
                return r1
            L15:
                r0 = 0
            L16:
                int r2 = r5.length()
                if (r0 >= r2) goto L2c
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                char r3 = r5.charAt(r0)
                boolean r2 = r2.canDecode(r3)
                if (r2 != 0) goto L29
                return r1
            L29:
                int r0 = r0 + 1
                goto L16
            L2c:
                r5 = 1
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] r13, java.lang.CharSequence r14) throws com.google.common.io.BaseEncoding.DecodingException {
                r12 = this;
                com.google.common.base.Preconditions.checkNotNull(r13)
                java.lang.CharSequence r14 = r12.trimTrailingPadding(r14)
                com.google.common.io.BaseEncoding$Alphabet r0 = r12.alphabet
                int r1 = r14.length()
                boolean r0 = r0.isValidPaddingStartPosition(r1)
                if (r0 == 0) goto L68
                r0 = 0
                r1 = 0
            L15:
                int r2 = r14.length()
                if (r0 >= r2) goto L67
                r2 = 0
                r4 = 0
                r5 = 0
            L1f:
                com.google.common.io.BaseEncoding$Alphabet r6 = r12.alphabet
                int r7 = r6.charsPerChunk
                if (r4 >= r7) goto L43
                int r6 = r6.bitsPerChar
                long r2 = r2 << r6
                int r6 = r0 + r4
                int r7 = r14.length()
                if (r6 >= r7) goto L40
                com.google.common.io.BaseEncoding$Alphabet r6 = r12.alphabet
                int r7 = r5 + 1
                int r5 = r5 + r0
                char r5 = r14.charAt(r5)
                int r5 = r6.decode(r5)
                long r5 = (long) r5
                long r2 = r2 | r5
                r5 = r7
            L40:
                int r4 = r4 + 1
                goto L1f
            L43:
                int r4 = r6.bytesPerChunk
                int r7 = r4 * 8
                int r6 = r6.bitsPerChar
                int r5 = r5 * r6
                int r7 = r7 - r5
                int r4 = r4 + (-1)
                int r4 = r4 * 8
            L50:
                if (r4 < r7) goto L61
                int r5 = r1 + 1
                long r8 = r2 >>> r4
                r10 = 255(0xff, double:1.26E-321)
                long r8 = r8 & r10
                int r6 = (int) r8
                byte r6 = (byte) r6
                r13[r1] = r6
                int r4 = r4 + (-8)
                r1 = r5
                goto L50
            L61:
                com.google.common.io.BaseEncoding$Alphabet r2 = r12.alphabet
                int r2 = r2.charsPerChunk
                int r0 = r0 + r2
                goto L15
            L67:
                return r1
            L68:
                com.google.common.io.BaseEncoding$DecodingException r13 = new com.google.common.io.BaseEncoding$DecodingException
                int r14 = r14.length()
                r0 = 32
                java.lang.String r1 = "Invalid input length "
                java.lang.String r14 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r14)
                r13.<init>(r14)
                throw r13
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.InputStream decodingStream(java.io.Reader r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.io.BaseEncoding$StandardBaseEncoding$2 r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding$2
                r0.<init>(r1, r2)
                return r0
        }

        public final void encodeChunkTo(java.lang.Appendable r8, byte[] r9, int r10, int r11) throws java.io.IOException {
                r7 = this;
                com.google.common.base.Preconditions.checkNotNull(r8)
                int r0 = r10 + r11
                int r1 = r9.length
                com.google.common.base.Preconditions.checkPositionIndexes(r10, r0, r1)
                com.google.common.io.BaseEncoding$Alphabet r0 = r7.alphabet
                int r0 = r0.bytesPerChunk
                r1 = 0
                if (r11 > r0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                com.google.common.base.Preconditions.checkArgument(r0)
                r2 = 0
                r0 = 0
            L19:
                r4 = 8
                if (r0 >= r11) goto L29
                int r5 = r10 + r0
                r5 = r9[r5]
                r5 = r5 & 255(0xff, float:3.57E-43)
                long r5 = (long) r5
                long r2 = r2 | r5
                long r2 = r2 << r4
                int r0 = r0 + 1
                goto L19
            L29:
                int r9 = r11 + 1
                int r9 = r9 * 8
                com.google.common.io.BaseEncoding$Alphabet r10 = r7.alphabet
                int r10 = r10.bitsPerChar
                int r9 = r9 - r10
            L32:
                int r10 = r11 * 8
                if (r1 >= r10) goto L4d
                int r10 = r9 - r1
                long r5 = r2 >>> r10
                int r10 = (int) r5
                com.google.common.io.BaseEncoding$Alphabet r0 = r7.alphabet
                int r5 = r0.mask
                r10 = r10 & r5
                char r10 = r0.encode(r10)
                r8.append(r10)
                com.google.common.io.BaseEncoding$Alphabet r10 = r7.alphabet
                int r10 = r10.bitsPerChar
                int r1 = r1 + r10
                goto L32
            L4d:
                java.lang.Character r9 = r7.paddingChar
                if (r9 == 0) goto L68
            L51:
                com.google.common.io.BaseEncoding$Alphabet r9 = r7.alphabet
                int r9 = r9.bytesPerChunk
                int r9 = r9 * 8
                if (r1 >= r9) goto L68
                java.lang.Character r9 = r7.paddingChar
                char r9 = r9.charValue()
                r8.append(r9)
                com.google.common.io.BaseEncoding$Alphabet r9 = r7.alphabet
                int r9 = r9.bitsPerChar
                int r1 = r1 + r9
                goto L51
            L68:
                return
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(java.lang.Appendable r5, byte[] r6, int r7, int r8) throws java.io.IOException {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                int r0 = r7 + r8
                int r1 = r6.length
                com.google.common.base.Preconditions.checkPositionIndexes(r7, r0, r1)
                r0 = 0
            La:
                if (r0 >= r8) goto L21
                int r1 = r7 + r0
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r2 = r2.bytesPerChunk
                int r3 = r8 - r0
                int r2 = java.lang.Math.min(r2, r3)
                r4.encodeChunkTo(r5, r6, r1, r2)
                com.google.common.io.BaseEncoding$Alphabet r1 = r4.alphabet
                int r1 = r1.bytesPerChunk
                int r0 = r0 + r1
                goto La
            L21:
                return
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.OutputStream encodingStream(java.io.Writer r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.io.BaseEncoding$StandardBaseEncoding$1 r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding$1
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.io.BaseEncoding.StandardBaseEncoding
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.io.BaseEncoding$StandardBaseEncoding r4 = (com.google.common.io.BaseEncoding.StandardBaseEncoding) r4
                com.google.common.io.BaseEncoding$Alphabet r0 = r3.alphabet
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                java.lang.Character r0 = r3.paddingChar
                java.lang.Character r4 = r4.paddingChar
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r4 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r4.alphabet
                int r0 = r0.hashCode()
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Character r2 = r4.paddingChar
                r3 = 0
                r1[r3] = r2
                int r1 = com.google.common.base.Objects.hashCode(r1)
                r0 = r0 ^ r1
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.lowerCase
                if (r0 != 0) goto L18
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                com.google.common.io.BaseEncoding$Alphabet r0 = r0.lowerCase()
                com.google.common.io.BaseEncoding$Alphabet r1 = r2.alphabet
                if (r0 != r1) goto L10
                r0 = r2
                goto L16
            L10:
                java.lang.Character r1 = r2.paddingChar
                com.google.common.io.BaseEncoding r0 = r2.newInstance(r0, r1)
            L16:
                r2.lowerCase = r0
            L18:
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public final int maxDecodedSize(int r5) {
                r4 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r4.alphabet
                int r0 = r0.bitsPerChar
                long r0 = (long) r0
                long r2 = (long) r5
                long r0 = r0 * r2
                r2 = 7
                long r0 = r0 + r2
                r2 = 8
                long r0 = r0 / r2
                int r5 = (int) r0
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        public final int maxEncodedSize(int r4) {
                r3 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r3.alphabet
                int r1 = r0.charsPerChunk
                int r0 = r0.bytesPerChunk
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r4 = com.google.common.math.IntMath.divide(r4, r0, r2)
                int r4 = r4 * r1
                return r4
        }

        public com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet r2, @javax.annotation.CheckForNull java.lang.Character r3) {
                r1 = this;
                com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
                r2 = this;
                java.lang.Character r0 = r2.paddingChar
                if (r0 != 0) goto L6
                r0 = r2
                goto Ld
            L6:
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                r1 = 0
                com.google.common.io.BaseEncoding r0 = r2.newInstance(r0, r1)
            Ld:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "BaseEncoding."
                r0.<init>(r1)
                com.google.common.io.BaseEncoding$Alphabet r1 = r3.alphabet
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                com.google.common.io.BaseEncoding$Alphabet r1 = r3.alphabet
                int r1 = r1.bitsPerChar
                r2 = 8
                int r2 = r2 % r1
                if (r2 == 0) goto L32
                java.lang.Character r1 = r3.paddingChar
                if (r1 != 0) goto L23
                java.lang.String r1 = ".omitPadding()"
                r0.append(r1)
                goto L32
            L23:
                java.lang.String r1 = ".withPadChar('"
                r0.append(r1)
                java.lang.Character r1 = r3.paddingChar
                r0.append(r1)
                java.lang.String r1 = "')"
                r0.append(r1)
            L32:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public final java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence r4) {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                java.lang.Character r0 = r3.paddingChar
                if (r0 != 0) goto L8
                return r4
            L8:
                char r0 = r0.charValue()
                int r1 = r4.length()
                int r1 = r1 + (-1)
            L12:
                if (r1 < 0) goto L1e
                char r2 = r4.charAt(r1)
                if (r2 == r0) goto L1b
                goto L1e
            L1b:
                int r1 = r1 + (-1)
                goto L12
            L1e:
                r0 = 0
                int r1 = r1 + 1
                java.lang.CharSequence r4 = r4.subSequence(r0, r1)
                return r4
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.upperCase
                if (r0 != 0) goto L18
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                com.google.common.io.BaseEncoding$Alphabet r0 = r0.upperCase()
                com.google.common.io.BaseEncoding$Alphabet r1 = r2.alphabet
                if (r0 != r1) goto L10
                r0 = r2
                goto L16
            L10:
                java.lang.Character r1 = r2.paddingChar
                com.google.common.io.BaseEncoding r0 = r2.newInstance(r0, r1)
            L16:
                r2.upperCase = r0
            L18:
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char r3) {
                r2 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                int r0 = r0.bitsPerChar
                r1 = 8
                int r1 = r1 % r0
                if (r1 == 0) goto L1f
                java.lang.Character r0 = r2.paddingChar
                if (r0 == 0) goto L14
                char r0 = r0.charValue()
                if (r0 != r3) goto L14
                goto L1f
            L14:
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
                com.google.common.io.BaseEncoding r3 = r2.newInstance(r0, r3)
                return r3
            L1f:
                return r2
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String r6, int r7) {
                r5 = this;
                r0 = 0
                r1 = 0
            L2:
                int r2 = r6.length()
                r3 = 1
                if (r1 >= r2) goto L1c
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                char r4 = r6.charAt(r1)
                boolean r2 = r2.matches(r4)
                r2 = r2 ^ r3
                java.lang.String r3 = "Separator (%s) cannot contain alphabet characters"
                com.google.common.base.Preconditions.checkArgument(r2, r3, r6)
                int r1 = r1 + 1
                goto L2
            L1c:
                java.lang.Character r1 = r5.paddingChar
                if (r1 == 0) goto L30
                char r1 = r1.charValue()
                int r1 = r6.indexOf(r1)
                if (r1 >= 0) goto L2b
                r0 = 1
            L2b:
                java.lang.String r1 = "Separator (%s) cannot contain padding character"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            L30:
                com.google.common.io.BaseEncoding$SeparatedBaseEncoding r0 = new com.google.common.io.BaseEncoding$SeparatedBaseEncoding
                r0.<init>(r5, r6, r7)
                return r0
        }
    }

    static {
            com.google.common.io.BaseEncoding$Base64Encoding r0 = new com.google.common.io.BaseEncoding$Base64Encoding
            r1 = 61
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.String r2 = "base64()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            r0.<init>(r2, r3, r1)
            com.google.common.io.BaseEncoding.BASE64 = r0
            com.google.common.io.BaseEncoding$Base64Encoding r0 = new com.google.common.io.BaseEncoding$Base64Encoding
            java.lang.String r2 = "base64Url()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            r0.<init>(r2, r3, r1)
            com.google.common.io.BaseEncoding.BASE64_URL = r0
            com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding
            com.google.common.io.BaseEncoding$Alphabet r2 = new com.google.common.io.BaseEncoding$Alphabet
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
            char[] r3 = r3.toCharArray()
            java.lang.String r4 = "base32()"
            r2.<init>(r4, r3)
            r0.<init>(r2, r1)
            com.google.common.io.BaseEncoding.BASE32 = r0
            com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding
            com.google.common.io.BaseEncoding$Alphabet r2 = new com.google.common.io.BaseEncoding$Alphabet
            java.lang.String r3 = "0123456789ABCDEFGHIJKLMNOPQRSTUV"
            char[] r3 = r3.toCharArray()
            java.lang.String r4 = "base32Hex()"
            r2.<init>(r4, r3)
            r0.<init>(r2, r1)
            com.google.common.io.BaseEncoding.BASE32_HEX = r0
            com.google.common.io.BaseEncoding$Base16Encoding r0 = new com.google.common.io.BaseEncoding$Base16Encoding
            r0.<init>()
            com.google.common.io.BaseEncoding.BASE16 = r0
            return
    }

    public BaseEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.io.BaseEncoding base16() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE16
            return r0
    }

    public static com.google.common.io.BaseEncoding base32() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE32
            return r0
    }

    public static com.google.common.io.BaseEncoding base32Hex() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE32_HEX
            return r0
    }

    public static com.google.common.io.BaseEncoding base64() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE64
            return r0
    }

    public static com.google.common.io.BaseEncoding base64Url() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE64_URL
            return r0
    }

    private static byte[] extract(byte[] r2, int r3) {
            int r0 = r2.length
            if (r3 != r0) goto L4
            return r2
        L4:
            byte[] r0 = new byte[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    public abstract boolean canDecode(java.lang.CharSequence r1);

    public final byte[] decode(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r2 = r1.trimTrailingPadding(r2)     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L17
            int r0 = r2.length()     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L17
            int r0 = r1.maxDecodedSize(r0)     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L17
            byte[] r0 = new byte[r0]     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L17
            int r2 = r1.decodeTo(r0, r2)     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L17
            byte[] r2 = extract(r0, r2)     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L17
            return r2
        L17:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
    }

    public abstract int decodeTo(byte[] r1, java.lang.CharSequence r2) throws com.google.common.io.BaseEncoding.DecodingException;

    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.io.ByteSource decodingSource(com.google.common.io.CharSource r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.io.BaseEncoding$2 r0 = new com.google.common.io.BaseEncoding$2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public abstract java.io.InputStream decodingStream(java.io.Reader r1);

    public java.lang.String encode(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            java.lang.String r3 = r2.encode(r3, r1, r0)
            return r3
    }

    public final java.lang.String encode(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.maxEncodedSize(r5)
            r0.<init>(r1)
            r2.encodeTo(r0, r3, r4, r5)     // Catch: java.io.IOException -> L17
            java.lang.String r3 = r0.toString()
            return r3
        L17:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
    }

    public abstract void encodeTo(java.lang.Appendable r1, byte[] r2, int r3, int r4) throws java.io.IOException;

    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.io.ByteSink encodingSink(com.google.common.io.CharSink r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.io.BaseEncoding$1 r0 = new com.google.common.io.BaseEncoding$1
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public abstract java.io.OutputStream encodingStream(java.io.Writer r1);

    public abstract com.google.common.io.BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int r1);

    public abstract int maxEncodedSize(int r1);

    public abstract com.google.common.io.BaseEncoding omitPadding();

    public java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    public abstract com.google.common.io.BaseEncoding upperCase();

    public abstract com.google.common.io.BaseEncoding withPadChar(char r1);

    public abstract com.google.common.io.BaseEncoding withSeparator(java.lang.String r1, int r2);
}
