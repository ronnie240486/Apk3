package com.google.common.escape;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends com.google.common.escape.Escaper {
    private static final int DEST_PAD = 32;

    public UnicodeEscaper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int codePointAt(java.lang.CharSequence r7, int r8, int r9) {
            com.google.common.base.Preconditions.checkNotNull(r7)
            if (r8 >= r9) goto La6
            int r0 = r8 + 1
            char r8 = r7.charAt(r8)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r1) goto La5
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r8 <= r1) goto L17
            goto La5
        L17:
            r1 = 56319(0xdbff, float:7.892E-41)
            java.lang.String r2 = "'"
            java.lang.String r3 = " in '"
            java.lang.String r4 = " at index "
            java.lang.String r5 = "' with value "
            if (r8 > r1) goto L6d
            if (r0 != r9) goto L28
            int r7 = -r8
            return r7
        L28:
            char r9 = r7.charAt(r0)
            boolean r1 = java.lang.Character.isLowSurrogate(r9)
            if (r1 == 0) goto L37
            int r7 = java.lang.Character.toCodePoint(r8, r9)
            return r7
        L37:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r1 = r7.length()
            int r1 = r1 + 89
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.String r1 = "Expected low surrogate but got char '"
            r6.append(r1)
            r6.append(r9)
            r6.append(r5)
            r6.append(r9)
            r6.append(r4)
            r6.append(r0)
            r6.append(r3)
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = r6.toString()
            r8.<init>(r7)
            throw r8
        L6d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            int r0 = r0 + (-1)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r1 = r7.length()
            int r1 = r1 + 88
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.String r1 = "Unexpected low surrogate character '"
            r6.append(r1)
            r6.append(r8)
            r6.append(r5)
            r6.append(r8)
            r6.append(r4)
            r6.append(r0)
            r6.append(r3)
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = r6.toString()
            r9.<init>(r7)
            throw r9
        La5:
            return r8
        La6:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r8 = "Index exceeds specified range"
            r7.<init>(r8)
            throw r7
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
    public java.lang.String escape(java.lang.String r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r3.length()
            r1 = 0
            int r1 = r2.nextEscapeIndex(r3, r1, r0)
            if (r1 != r0) goto Lf
            goto L13
        Lf:
            java.lang.String r3 = r2.escapeSlow(r3, r1)
        L13:
            return r3
    }

    @javax.annotation.CheckForNull
    public abstract char[] escape(int r1);

    public final java.lang.String escapeSlow(java.lang.String r12, int r13) {
            r11 = this;
            int r0 = r12.length()
            char[] r1 = com.google.common.escape.Platform.charBufferFromThreadLocal()
            r2 = 0
            r3 = 0
            r4 = 0
        Lb:
            if (r13 >= r0) goto L52
            int r5 = codePointAt(r12, r13, r0)
            if (r5 < 0) goto L4a
            char[] r6 = r11.escape(r5)
            boolean r5 = java.lang.Character.isSupplementaryCodePoint(r5)
            if (r5 == 0) goto L1f
            r5 = 2
            goto L20
        L1f:
            r5 = 1
        L20:
            int r5 = r5 + r13
            if (r6 == 0) goto L45
            int r7 = r13 - r3
            int r8 = r4 + r7
            int r9 = r6.length
            int r9 = r9 + r8
            int r10 = r1.length
            if (r10 >= r9) goto L35
            int r10 = r0 - r13
            int r10 = r10 + r9
            int r10 = r10 + 32
            char[] r1 = growBuffer(r1, r4, r10)
        L35:
            if (r7 <= 0) goto L3b
            r12.getChars(r3, r13, r1, r4)
            r4 = r8
        L3b:
            int r13 = r6.length
            if (r13 <= 0) goto L44
            int r13 = r6.length
            java.lang.System.arraycopy(r6, r2, r1, r4, r13)
            int r13 = r6.length
            int r4 = r4 + r13
        L44:
            r3 = r5
        L45:
            int r13 = r11.nextEscapeIndex(r12, r5, r0)
            goto Lb
        L4a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Trailing high surrogate at end of input"
            r12.<init>(r13)
            throw r12
        L52:
            int r13 = r0 - r3
            if (r13 <= 0) goto L62
            int r13 = r13 + r4
            int r5 = r1.length
            if (r5 >= r13) goto L5e
            char[] r1 = growBuffer(r1, r4, r13)
        L5e:
            r12.getChars(r3, r0, r1, r4)
            r4 = r13
        L62:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1, r2, r4)
            return r12
    }

    public int nextEscapeIndex(java.lang.CharSequence r3, int r4, int r5) {
            r2 = this;
        L0:
            if (r4 >= r5) goto L1a
            int r0 = codePointAt(r3, r4, r5)
            if (r0 < 0) goto L1a
            char[] r1 = r2.escape(r0)
            if (r1 == 0) goto Lf
            goto L1a
        Lf:
            boolean r0 = java.lang.Character.isSupplementaryCodePoint(r0)
            if (r0 == 0) goto L17
            r0 = 2
            goto L18
        L17:
            r0 = 1
        L18:
            int r4 = r4 + r0
            goto L0
        L1a:
            return r4
    }
}
