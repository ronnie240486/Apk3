package com.google.common.escape;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {
    private final java.util.Map<java.lang.Character, java.lang.String> map;
    private int max;

    /* JADX INFO: loaded from: classes.dex */
    public static class CharArrayDecorator extends com.google.common.escape.CharEscaper {
        private final int replaceLength;
        private final char[][] replacements;

        public CharArrayDecorator(char[][] r1) {
                r0 = this;
                r0.<init>()
                r0.replacements = r1
                int r1 = r1.length
                r0.replaceLength = r1
                return
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public java.lang.String escape(java.lang.String r6) {
                r5 = this;
                int r0 = r6.length()
                r1 = 0
            L5:
                if (r1 >= r0) goto L1c
                char r2 = r6.charAt(r1)
                char[][] r3 = r5.replacements
                int r4 = r3.length
                if (r2 >= r4) goto L19
                r2 = r3[r2]
                if (r2 == 0) goto L19
                java.lang.String r6 = r5.escapeSlow(r6, r1)
                return r6
            L19:
                int r1 = r1 + 1
                goto L5
            L1c:
                return r6
        }

        @Override // com.google.common.escape.CharEscaper
        @javax.annotation.CheckForNull
        public final char[] escape(char r2) {
                r1 = this;
                int r0 = r1.replaceLength
                if (r2 >= r0) goto L9
                char[][] r0 = r1.replacements
                r2 = r0[r2]
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }
    }

    public CharEscaperBuilder() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.max = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.escape.CharEscaperBuilder addEscape(char r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.Character, java.lang.String> r0 = r2.map
            java.lang.Character r1 = java.lang.Character.valueOf(r3)
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r1, r4)
            int r4 = r2.max
            if (r3 <= r4) goto L15
            r2.max = r3
        L15:
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.escape.CharEscaperBuilder addEscapes(char[] r4, java.lang.String r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r4.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            char r2 = r4[r1]
            r3.addEscape(r2, r5)
            int r1 = r1 + 1
            goto L5
        Lf:
            return r3
    }

    public char[][] toArray() {
            r4 = this;
            int r0 = r4.max
            int r0 = r0 + 1
            char[][] r0 = new char[r0][]
            java.util.Map<java.lang.Character, java.lang.String> r1 = r4.map
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            r0[r3] = r2
            goto L10
        L33:
            return r0
    }

    public com.google.common.escape.Escaper toEscaper() {
            r2 = this;
            com.google.common.escape.CharEscaperBuilder$CharArrayDecorator r0 = new com.google.common.escape.CharEscaperBuilder$CharArrayDecorator
            char[][] r1 = r2.toArray()
            r0.<init>(r1)
            return r0
    }
}
