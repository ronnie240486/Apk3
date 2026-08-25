package com.google.common.escape;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends com.google.common.escape.UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            r0 = 0
        L4:
            int r1 = r4.length()
            if (r0 >= r1) goto L28
            char r1 = r4.charAt(r0)
            int r2 = r3.replacementsLength
            if (r1 >= r2) goto L18
            char[][] r2 = r3.replacements
            r2 = r2[r1]
            if (r2 != 0) goto L24
        L18:
            char r2 = r3.safeMaxChar
            if (r1 > r2) goto L24
            char r2 = r3.safeMinChar
            if (r1 >= r2) goto L21
            goto L24
        L21:
            int r0 = r0 + 1
            goto L4
        L24:
            java.lang.String r4 = r3.escapeSlow(r4, r0)
        L28:
            return r4
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @javax.annotation.CheckForNull
    public final char[] escape(int r2) {
            r1 = this;
            int r0 = r1.replacementsLength
            if (r2 >= r0) goto Lb
            char[][] r0 = r1.replacements
            r0 = r0[r2]
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = r1.safeMin
            if (r2 < r0) goto L15
            int r0 = r1.safeMax
            if (r2 > r0) goto L15
            r2 = 0
            return r2
        L15:
            char[] r2 = r1.escapeUnsafe$1()
            return r2
    }

    @javax.annotation.CheckForNull
    public abstract char[] escapeUnsafe$1();

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(java.lang.CharSequence r3, int r4, int r5) {
            r2 = this;
        L0:
            if (r4 >= r5) goto L1c
            char r0 = r3.charAt(r4)
            int r1 = r2.replacementsLength
            if (r0 >= r1) goto L10
            char[][] r1 = r2.replacements
            r1 = r1[r0]
            if (r1 != 0) goto L1c
        L10:
            char r1 = r2.safeMaxChar
            if (r0 > r1) goto L1c
            char r1 = r2.safeMinChar
            if (r0 >= r1) goto L19
            goto L1c
        L19:
            int r4 = r4 + 1
            goto L0
        L1c:
            return r4
    }
}
