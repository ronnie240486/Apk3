package com.google.thirdparty.publicsuffix;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
final class TrieParser {
    private static final com.google.common.base.Joiner PREFIX_JOINER = null;

    static {
            java.lang.String r0 = ""
            com.google.common.base.Joiner r0 = com.google.common.base.Joiner.on(r0)
            com.google.thirdparty.publicsuffix.TrieParser.PREFIX_JOINER = r0
            return
    }

    public TrieParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int doParseTrieToBuilder(java.util.Deque<java.lang.CharSequence> r8, java.lang.CharSequence r9, int r10, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r11) {
            int r0 = r9.length()
            r1 = 0
            r2 = r10
        L6:
            r3 = 58
            r4 = 33
            r5 = 44
            r6 = 63
            if (r2 >= r0) goto L24
            char r1 = r9.charAt(r2)
            r7 = 38
            if (r1 == r7) goto L24
            if (r1 == r6) goto L24
            if (r1 == r4) goto L24
            if (r1 == r3) goto L24
            if (r1 != r5) goto L21
            goto L24
        L21:
            int r2 = r2 + 1
            goto L6
        L24:
            java.lang.CharSequence r7 = r9.subSequence(r10, r2)
            java.lang.CharSequence r7 = reverse(r7)
            r8.push(r7)
            if (r1 == r4) goto L37
            if (r1 == r6) goto L37
            if (r1 == r3) goto L37
            if (r1 != r5) goto L4a
        L37:
            com.google.common.base.Joiner r3 = com.google.thirdparty.publicsuffix.TrieParser.PREFIX_JOINER
            java.lang.String r3 = r3.join(r8)
            int r4 = r3.length()
            if (r4 <= 0) goto L4a
            com.google.thirdparty.publicsuffix.PublicSuffixType r4 = com.google.thirdparty.publicsuffix.PublicSuffixType.fromCode(r1)
            r11.put(r3, r4)
        L4a:
            int r2 = r2 + 1
            if (r1 == r6) goto L65
            if (r1 == r5) goto L65
        L50:
            if (r2 >= r0) goto L65
            int r1 = doParseTrieToBuilder(r8, r9, r2, r11)
            int r2 = r2 + r1
            char r1 = r9.charAt(r2)
            if (r1 == r6) goto L63
            char r1 = r9.charAt(r2)
            if (r1 != r5) goto L50
        L63:
            int r2 = r2 + 1
        L65:
            r8.pop()
            int r2 = r2 - r10
            return r2
    }

    public static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseTrie(java.lang.CharSequence r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            int r1 = r4.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L15
            java.util.ArrayDeque r3 = com.google.common.collect.Queues.newArrayDeque()
            int r3 = doParseTrieToBuilder(r3, r4, r2, r0)
            int r2 = r2 + r3
            goto L9
        L15:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    private static java.lang.CharSequence reverse(java.lang.CharSequence r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r1 = r0.reverse()
            return r1
    }
}
