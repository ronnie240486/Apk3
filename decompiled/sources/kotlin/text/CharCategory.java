package kotlin.text;

/* JADX INFO: compiled from: CharCategoryJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b \b\u0086\u0001\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006."}, d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", "char", "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum CharCategory extends java.lang.Enum<kotlin.text.CharCategory> {
    private static final /* synthetic */ kotlin.text.CharCategory[] $VALUES = null;
    public static final kotlin.text.CharCategory COMBINING_SPACING_MARK = null;
    public static final kotlin.text.CharCategory CONNECTOR_PUNCTUATION = null;
    public static final kotlin.text.CharCategory CONTROL = null;
    public static final kotlin.text.CharCategory CURRENCY_SYMBOL = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharCategory.Companion Companion = null;
    public static final kotlin.text.CharCategory DASH_PUNCTUATION = null;
    public static final kotlin.text.CharCategory DECIMAL_DIGIT_NUMBER = null;
    public static final kotlin.text.CharCategory ENCLOSING_MARK = null;
    public static final kotlin.text.CharCategory END_PUNCTUATION = null;
    public static final kotlin.text.CharCategory FINAL_QUOTE_PUNCTUATION = null;
    public static final kotlin.text.CharCategory FORMAT = null;
    public static final kotlin.text.CharCategory INITIAL_QUOTE_PUNCTUATION = null;
    public static final kotlin.text.CharCategory LETTER_NUMBER = null;
    public static final kotlin.text.CharCategory LINE_SEPARATOR = null;
    public static final kotlin.text.CharCategory LOWERCASE_LETTER = null;
    public static final kotlin.text.CharCategory MATH_SYMBOL = null;
    public static final kotlin.text.CharCategory MODIFIER_LETTER = null;
    public static final kotlin.text.CharCategory MODIFIER_SYMBOL = null;
    public static final kotlin.text.CharCategory NON_SPACING_MARK = null;
    public static final kotlin.text.CharCategory OTHER_LETTER = null;
    public static final kotlin.text.CharCategory OTHER_NUMBER = null;
    public static final kotlin.text.CharCategory OTHER_PUNCTUATION = null;
    public static final kotlin.text.CharCategory OTHER_SYMBOL = null;
    public static final kotlin.text.CharCategory PARAGRAPH_SEPARATOR = null;
    public static final kotlin.text.CharCategory PRIVATE_USE = null;
    public static final kotlin.text.CharCategory SPACE_SEPARATOR = null;
    public static final kotlin.text.CharCategory START_PUNCTUATION = null;
    public static final kotlin.text.CharCategory SURROGATE = null;
    public static final kotlin.text.CharCategory TITLECASE_LETTER = null;
    public static final kotlin.text.CharCategory UNASSIGNED = null;
    public static final kotlin.text.CharCategory UPPERCASE_LETTER = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String code;
    private final int value;

    /* JADX INFO: compiled from: CharCategoryJVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.CharCategory valueOf(int r4) {
                r3 = this;
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                r1 = 0
                r2 = 16
                r0.<init>(r1, r2)
                boolean r0 = r0.contains(r4)
                if (r0 == 0) goto L15
                kotlin.text.CharCategory[] r0 = kotlin.text.CharCategory.values()
                r4 = r0[r4]
                goto L2c
            L15:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                r1 = 18
                r2 = 30
                r0.<init>(r1, r2)
                boolean r0 = r0.contains(r4)
                if (r0 == 0) goto L2d
                kotlin.text.CharCategory[] r0 = kotlin.text.CharCategory.values()
                int r4 = r4 + (-1)
                r4 = r0[r4]
            L2c:
                return r4
            L2d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Category #"
                java.lang.String r2 = " is not defined."
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
                r0.<init>(r4)
                throw r0
        }
    }

    private static final /* synthetic */ kotlin.text.CharCategory[] $values() {
            r0 = 30
            kotlin.text.CharCategory[] r0 = new kotlin.text.CharCategory[r0]
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.UNASSIGNED
            r2 = 0
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.UPPERCASE_LETTER
            r2 = 1
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.LOWERCASE_LETTER
            r2 = 2
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.TITLECASE_LETTER
            r2 = 3
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.MODIFIER_LETTER
            r2 = 4
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_LETTER
            r2 = 5
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.NON_SPACING_MARK
            r2 = 6
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.ENCLOSING_MARK
            r2 = 7
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.COMBINING_SPACING_MARK
            r2 = 8
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.DECIMAL_DIGIT_NUMBER
            r2 = 9
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.LETTER_NUMBER
            r2 = 10
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_NUMBER
            r2 = 11
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.SPACE_SEPARATOR
            r2 = 12
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.LINE_SEPARATOR
            r2 = 13
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.PARAGRAPH_SEPARATOR
            r2 = 14
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.CONTROL
            r2 = 15
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.FORMAT
            r2 = 16
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.PRIVATE_USE
            r2 = 17
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.SURROGATE
            r2 = 18
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.DASH_PUNCTUATION
            r2 = 19
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.START_PUNCTUATION
            r2 = 20
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.END_PUNCTUATION
            r2 = 21
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.CONNECTOR_PUNCTUATION
            r2 = 22
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_PUNCTUATION
            r2 = 23
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.MATH_SYMBOL
            r2 = 24
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.CURRENCY_SYMBOL
            r2 = 25
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.MODIFIER_SYMBOL
            r2 = 26
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_SYMBOL
            r2 = 27
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.INITIAL_QUOTE_PUNCTUATION
            r2 = 28
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.FINAL_QUOTE_PUNCTUATION
            r2 = 29
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "UNASSIGNED"
            r2 = 0
            java.lang.String r3 = "Cn"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.UNASSIGNED = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "UPPERCASE_LETTER"
            r2 = 1
            java.lang.String r3 = "Lu"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.UPPERCASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "LOWERCASE_LETTER"
            r2 = 2
            java.lang.String r3 = "Ll"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.LOWERCASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "TITLECASE_LETTER"
            r2 = 3
            java.lang.String r3 = "Lt"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.TITLECASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "MODIFIER_LETTER"
            r2 = 4
            java.lang.String r3 = "Lm"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.MODIFIER_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "OTHER_LETTER"
            r2 = 5
            java.lang.String r3 = "Lo"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.OTHER_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "NON_SPACING_MARK"
            r2 = 6
            java.lang.String r3 = "Mn"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.NON_SPACING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "ENCLOSING_MARK"
            r2 = 7
            java.lang.String r3 = "Me"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.ENCLOSING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "COMBINING_SPACING_MARK"
            r2 = 8
            java.lang.String r3 = "Mc"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.COMBINING_SPACING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "DECIMAL_DIGIT_NUMBER"
            r2 = 9
            java.lang.String r3 = "Nd"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.DECIMAL_DIGIT_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "LETTER_NUMBER"
            r2 = 10
            java.lang.String r3 = "Nl"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.LETTER_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "OTHER_NUMBER"
            r2 = 11
            java.lang.String r3 = "No"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.OTHER_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "SPACE_SEPARATOR"
            r2 = 12
            java.lang.String r3 = "Zs"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.SPACE_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "LINE_SEPARATOR"
            r2 = 13
            java.lang.String r3 = "Zl"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.LINE_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "PARAGRAPH_SEPARATOR"
            r2 = 14
            java.lang.String r3 = "Zp"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.PARAGRAPH_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "CONTROL"
            r2 = 15
            java.lang.String r3 = "Cc"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.CONTROL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "FORMAT"
            r2 = 16
            java.lang.String r3 = "Cf"
            r0.<init>(r1, r2, r2, r3)
            kotlin.text.CharCategory.FORMAT = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "PRIVATE_USE"
            r2 = 17
            r3 = 18
            java.lang.String r4 = "Co"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.PRIVATE_USE = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "SURROGATE"
            r2 = 19
            java.lang.String r4 = "Cs"
            r0.<init>(r1, r3, r2, r4)
            kotlin.text.CharCategory.SURROGATE = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "DASH_PUNCTUATION"
            r3 = 20
            java.lang.String r4 = "Pd"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.DASH_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "START_PUNCTUATION"
            r2 = 21
            java.lang.String r4 = "Ps"
            r0.<init>(r1, r3, r2, r4)
            kotlin.text.CharCategory.START_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "END_PUNCTUATION"
            r3 = 22
            java.lang.String r4 = "Pe"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.END_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "CONNECTOR_PUNCTUATION"
            r2 = 23
            java.lang.String r4 = "Pc"
            r0.<init>(r1, r3, r2, r4)
            kotlin.text.CharCategory.CONNECTOR_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "OTHER_PUNCTUATION"
            r3 = 24
            java.lang.String r4 = "Po"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.OTHER_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "MATH_SYMBOL"
            r2 = 24
            r3 = 25
            java.lang.String r4 = "Sm"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.MATH_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "CURRENCY_SYMBOL"
            r2 = 25
            r3 = 26
            java.lang.String r4 = "Sc"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.CURRENCY_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "MODIFIER_SYMBOL"
            r2 = 26
            r3 = 27
            java.lang.String r4 = "Sk"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.MODIFIER_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "OTHER_SYMBOL"
            r2 = 27
            r3 = 28
            java.lang.String r4 = "So"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.OTHER_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "INITIAL_QUOTE_PUNCTUATION"
            r2 = 28
            r3 = 29
            java.lang.String r4 = "Pi"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.INITIAL_QUOTE_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "FINAL_QUOTE_PUNCTUATION"
            r2 = 29
            r3 = 30
            java.lang.String r4 = "Pf"
            r0.<init>(r1, r2, r3, r4)
            kotlin.text.CharCategory.FINAL_QUOTE_PUNCTUATION = r0
            kotlin.text.CharCategory[] r0 = $values()
            kotlin.text.CharCategory.$VALUES = r0
            kotlin.text.CharCategory$Companion r0 = new kotlin.text.CharCategory$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.CharCategory.Companion = r0
            return
    }

    private CharCategory(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            r0.code = r4
            return
    }

    public static kotlin.text.CharCategory valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.text.CharCategory> r0 = kotlin.text.CharCategory.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.text.CharCategory r1 = (kotlin.text.CharCategory) r1
            return r1
    }

    public static kotlin.text.CharCategory[] values() {
            kotlin.text.CharCategory[] r0 = kotlin.text.CharCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.text.CharCategory[] r0 = (kotlin.text.CharCategory[]) r0
            return r0
    }

    public final boolean contains(char r2) {
            r1 = this;
            int r2 = java.lang.Character.getType(r2)
            int r0 = r1.value
            if (r2 != r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
