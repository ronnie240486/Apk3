package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract enum CaseFormat extends java.lang.Enum<com.google.common.base.CaseFormat> {
    private static final /* synthetic */ com.google.common.base.CaseFormat[] $VALUES = null;
    public static final com.google.common.base.CaseFormat LOWER_CAMEL = null;
    public static final com.google.common.base.CaseFormat LOWER_HYPHEN = null;
    public static final com.google.common.base.CaseFormat LOWER_UNDERSCORE = null;
    public static final com.google.common.base.CaseFormat UPPER_CAMEL = null;
    public static final com.google.common.base.CaseFormat UPPER_UNDERSCORE = null;
    private final com.google.common.base.CharMatcher wordBoundary;
    private final java.lang.String wordSeparator;






    public static final class StringConverter extends com.google.common.base.Converter<java.lang.String, java.lang.String> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.CaseFormat sourceFormat;
        private final com.google.common.base.CaseFormat targetFormat;

        public StringConverter(com.google.common.base.CaseFormat r1, com.google.common.base.CaseFormat r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CaseFormat r1 = (com.google.common.base.CaseFormat) r1
                r0.sourceFormat = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.CaseFormat r1 = (com.google.common.base.CaseFormat) r1
                r0.targetFormat = r1
                return
        }

        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = (java.lang.String) r3
                com.google.common.base.CaseFormat r0 = r2.targetFormat
                com.google.common.base.CaseFormat r1 = r2.sourceFormat
                java.lang.String r3 = r0.to(r1, r3)
                return r3
        }

        @Override // com.google.common.base.Converter
        public final java.lang.String doForward(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = (java.lang.String) r3
                com.google.common.base.CaseFormat r0 = r2.sourceFormat
                com.google.common.base.CaseFormat r1 = r2.targetFormat
                java.lang.String r3 = r0.to(r1, r3)
                return r3
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.CaseFormat.StringConverter
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.CaseFormat$StringConverter r4 = (com.google.common.base.CaseFormat.StringConverter) r4
                com.google.common.base.CaseFormat r0 = r3.sourceFormat
                com.google.common.base.CaseFormat r2 = r4.sourceFormat
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                com.google.common.base.CaseFormat r0 = r3.targetFormat
                com.google.common.base.CaseFormat r4 = r4.targetFormat
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.CaseFormat r0 = r2.sourceFormat
                int r0 = r0.hashCode()
                com.google.common.base.CaseFormat r1 = r2.targetFormat
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.CaseFormat r0 = r5.sourceFormat
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.CaseFormat r1 = r5.targetFormat
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 14
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = ".converterTo("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    private static /* synthetic */ com.google.common.base.CaseFormat[] $values() {
            r0 = 5
            com.google.common.base.CaseFormat[] r0 = new com.google.common.base.CaseFormat[r0]
            com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.LOWER_HYPHEN
            r2 = 0
            r0[r2] = r1
            com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.LOWER_UNDERSCORE
            r2 = 1
            r0[r2] = r1
            com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.LOWER_CAMEL
            r2 = 2
            r0[r2] = r1
            com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.UPPER_CAMEL
            r2 = 3
            r0[r2] = r1
            com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.UPPER_UNDERSCORE
            r2 = 4
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.base.CaseFormat$1 r0 = new com.google.common.base.CaseFormat$1
            r1 = 45
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.is(r1)
            r0.<init>(r1)
            com.google.common.base.CaseFormat.LOWER_HYPHEN = r0
            com.google.common.base.CaseFormat$2 r0 = new com.google.common.base.CaseFormat$2
            r1 = 95
            com.google.common.base.CharMatcher r2 = com.google.common.base.CharMatcher.is(r1)
            r0.<init>(r2)
            com.google.common.base.CaseFormat.LOWER_UNDERSCORE = r0
            com.google.common.base.CaseFormat$3 r0 = new com.google.common.base.CaseFormat$3
            r2 = 65
            r3 = 90
            com.google.common.base.CharMatcher r4 = com.google.common.base.CharMatcher.inRange(r2, r3)
            r0.<init>(r4)
            com.google.common.base.CaseFormat.LOWER_CAMEL = r0
            com.google.common.base.CaseFormat$4 r0 = new com.google.common.base.CaseFormat$4
            com.google.common.base.CharMatcher r2 = com.google.common.base.CharMatcher.inRange(r2, r3)
            r0.<init>(r2)
            com.google.common.base.CaseFormat.UPPER_CAMEL = r0
            com.google.common.base.CaseFormat$5 r0 = new com.google.common.base.CaseFormat$5
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.is(r1)
            r0.<init>(r1)
            com.google.common.base.CaseFormat.UPPER_UNDERSCORE = r0
            com.google.common.base.CaseFormat[] r0 = $values()
            com.google.common.base.CaseFormat.$VALUES = r0
            return
    }

    private CaseFormat(java.lang.String r1, int r2, com.google.common.base.CharMatcher r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.wordBoundary = r3
            r0.wordSeparator = r4
            return
    }

    public /* synthetic */ CaseFormat(java.lang.String r1, int r2, com.google.common.base.CharMatcher r3, java.lang.String r4, com.google.common.base.CaseFormat.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ java.lang.String access$100(java.lang.String r0) {
            java.lang.String r0 = firstCharOnlyToUpper(r0)
            return r0
    }

    private static java.lang.String firstCharOnlyToUpper(java.lang.String r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L2c
        L7:
            r0 = 0
            char r0 = r3.charAt(r0)
            char r0 = com.google.common.base.Ascii.toUpperCase(r0)
            r1 = 1
            java.lang.String r3 = r3.substring(r1)
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L2c:
            return r3
    }

    public static com.google.common.base.CaseFormat valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.base.CaseFormat> r0 = com.google.common.base.CaseFormat.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.base.CaseFormat r1 = (com.google.common.base.CaseFormat) r1
            return r1
    }

    public static com.google.common.base.CaseFormat[] values() {
            com.google.common.base.CaseFormat[] r0 = com.google.common.base.CaseFormat.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.base.CaseFormat[] r0 = (com.google.common.base.CaseFormat[]) r0
            return r0
    }

    public java.lang.String convert(com.google.common.base.CaseFormat r7, java.lang.String r8) {
            r6 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = -1
        L4:
            com.google.common.base.CharMatcher r4 = r6.wordBoundary
            int r3 = r3 + 1
            int r3 = r4.indexIn(r8, r3)
            if (r3 == r0) goto L49
            if (r2 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = r8.length()
            java.lang.String r5 = r7.wordSeparator
            int r5 = r5.length()
            int r5 = r5 * 4
            int r5 = r5 + r4
            r1.<init>(r5)
            java.lang.String r2 = r8.substring(r2, r3)
            java.lang.String r2 = r7.normalizeFirstWord(r2)
            r1.append(r2)
            goto L3c
        L2e:
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = r8.substring(r2, r3)
            java.lang.String r2 = r7.normalizeWord(r2)
            r1.append(r2)
        L3c:
            java.lang.String r2 = r7.wordSeparator
            r1.append(r2)
            java.lang.String r2 = r6.wordSeparator
            int r2 = r2.length()
            int r2 = r2 + r3
            goto L4
        L49:
            if (r2 != 0) goto L50
            java.lang.String r7 = r7.normalizeFirstWord(r8)
            goto L62
        L50:
            java.util.Objects.requireNonNull(r1)
            java.lang.String r8 = r8.substring(r2)
            java.lang.String r7 = r7.normalizeWord(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L62:
            return r7
    }

    public com.google.common.base.Converter<java.lang.String, java.lang.String> converterTo(com.google.common.base.CaseFormat r2) {
            r1 = this;
            com.google.common.base.CaseFormat$StringConverter r0 = new com.google.common.base.CaseFormat$StringConverter
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String normalizeFirstWord(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.normalizeWord(r1)
            return r1
    }

    public abstract java.lang.String normalizeWord(java.lang.String r1);

    public final java.lang.String to(com.google.common.base.CaseFormat r1, java.lang.String r2) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            if (r1 != r0) goto L9
            goto Ld
        L9:
            java.lang.String r2 = r0.convert(r1, r2)
        Ld:
            return r2
    }
}
