package com.google.common.escape;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends com.google.common.escape.CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    public ArrayBasedCharEscaper(java.util.Map<java.lang.Character, java.lang.String> r1, char r2, char r3) {
            r0 = this;
            com.google.common.escape.ArrayBasedEscaperMap r1 = com.google.common.escape.ArrayBasedEscaperMap.create(r1)
            r0.<init>()
            com.google.common.base.Preconditions.checkNotNull(r1)
            char[][] r1 = r1.getReplacementArray()
            r0.replacements = r1
            int r1 = r1.length
            r0.replacementsLength = r1
            if (r3 >= r2) goto L19
            r3 = 0
            r2 = 65535(0xffff, float:9.1834E-41)
        L19:
            r0.safeMin = r2
            r0.safeMax = r3
            return
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
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
            char r2 = r3.safeMax
            if (r1 > r2) goto L24
            char r2 = r3.safeMin
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

    @Override // com.google.common.escape.CharEscaper
    @javax.annotation.CheckForNull
    public final char[] escape(char r2) {
            r1 = this;
            int r0 = r1.replacementsLength
            if (r2 >= r0) goto Lb
            char[][] r0 = r1.replacements
            r0 = r0[r2]
            if (r0 == 0) goto Lb
            return r0
        Lb:
            char r0 = r1.safeMin
            if (r2 < r0) goto L15
            char r0 = r1.safeMax
            if (r2 > r0) goto L15
            r2 = 0
            return r2
        L15:
            char[] r2 = r1.escapeUnsafe()
            return r2
    }

    @javax.annotation.CheckForNull
    public abstract char[] escapeUnsafe();
}
