package com.google.common.io;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
abstract class LineBuffer {
    private java.lang.StringBuilder line;
    private boolean sawReturn;

    public LineBuffer() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.line = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private boolean finishLine(boolean r2) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = r1.line
            java.lang.String r0 = r0.toString()
            r1.handleLine(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.line = r0
            r0 = 0
            r1.sawReturn = r0
            return r2
    }

    public final void add(char[] r8, int r9) throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.sawReturn
            r1 = 0
            r2 = 1
            r3 = 10
            if (r0 == 0) goto L19
            if (r9 <= 0) goto L19
            char r0 = r8[r1]
            if (r0 != r3) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r0 = r7.finishLine(r0)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            int r9 = r9 + r1
            r4 = r0
        L1c:
            if (r0 >= r9) goto L51
            char r5 = r8[r0]
            if (r5 == r3) goto L43
            r6 = 13
            if (r5 == r6) goto L27
            goto L4f
        L27:
            java.lang.StringBuilder r5 = r7.line
            int r6 = r0 - r4
            r5.append(r8, r4, r6)
            r7.sawReturn = r2
            int r4 = r0 + 1
            if (r4 >= r9) goto L4d
            char r5 = r8[r4]
            if (r5 != r3) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            boolean r5 = r7.finishLine(r5)
            if (r5 == 0) goto L4d
            r0 = r4
            goto L4d
        L43:
            java.lang.StringBuilder r5 = r7.line
            int r6 = r0 - r4
            r5.append(r8, r4, r6)
            r7.finishLine(r2)
        L4d:
            int r4 = r0 + 1
        L4f:
            int r0 = r0 + r2
            goto L1c
        L51:
            java.lang.StringBuilder r0 = r7.line
            int r9 = r9 - r4
            r0.append(r8, r4, r9)
            return
    }

    public final void finish() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.sawReturn
            if (r0 != 0) goto Lc
            java.lang.StringBuilder r0 = r1.line
            int r0 = r0.length()
            if (r0 <= 0) goto L10
        Lc:
            r0 = 0
            r1.finishLine(r0)
        L10:
            return
    }

    public abstract void handleLine(java.lang.String r1) throws java.io.IOException;
}
