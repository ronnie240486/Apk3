package com.google.common.escape;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends com.google.common.escape.Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    public CharEscaper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static char[] growBuffer(char[] r1, int r2, int r3) {
            if (r3 < 0) goto Lb
            char[] r3 = new char[r3]
            if (r2 <= 0) goto La
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r3, r0, r2)
        La:
            return r3
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Cannot increase internal buffer any further"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r4.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L1c
            char r2 = r4.charAt(r1)
            char[] r2 = r3.escape(r2)
            if (r2 == 0) goto L19
            java.lang.String r4 = r3.escapeSlow(r4, r1)
            return r4
        L19:
            int r1 = r1 + 1
            goto L8
        L1c:
            return r4
    }

    @javax.annotation.CheckForNull
    public abstract char[] escape(char r1);

    public final java.lang.String escapeSlow(java.lang.String r12, int r13) {
            r11 = this;
            int r0 = r12.length()
            char[] r1 = com.google.common.escape.Platform.charBufferFromThreadLocal()
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        Lc:
            if (r13 >= r0) goto L3c
            char r6 = r12.charAt(r13)
            char[] r6 = r11.escape(r6)
            if (r6 != 0) goto L19
            goto L39
        L19:
            int r7 = r6.length
            int r8 = r13 - r4
            int r9 = r5 + r8
            int r10 = r9 + r7
            if (r2 >= r10) goto L2b
            int r2 = r0 - r13
            int r2 = r2 * 2
            int r2 = r2 + r10
            char[] r1 = growBuffer(r1, r5, r2)
        L2b:
            if (r8 <= 0) goto L31
            r12.getChars(r4, r13, r1, r5)
            r5 = r9
        L31:
            if (r7 <= 0) goto L37
            java.lang.System.arraycopy(r6, r3, r1, r5, r7)
            int r5 = r5 + r7
        L37:
            int r4 = r13 + 1
        L39:
            int r13 = r13 + 1
            goto Lc
        L3c:
            int r13 = r0 - r4
            if (r13 <= 0) goto L4b
            int r13 = r13 + r5
            if (r2 >= r13) goto L47
            char[] r1 = growBuffer(r1, r5, r13)
        L47:
            r12.getChars(r4, r0, r1, r5)
            r5 = r13
        L4b:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1, r3, r5)
            return r12
    }
}
