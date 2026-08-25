package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends com.google.common.base.CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] r1, long r2, boolean r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r5)
            r0.table = r1
            r0.filter = r2
            r0.containsZero = r4
            return
    }

    private boolean checkFilter(int r5) {
            r4 = this;
            long r0 = r4.filter
            long r0 = r0 >> r5
            r2 = 1
            long r0 = r0 & r2
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            return r5
    }

    public static com.google.common.base.CharMatcher from(java.util.BitSet r10, java.lang.String r11) {
            int r0 = r10.cardinality()
            r1 = 0
            boolean r6 = r10.get(r1)
            r2 = 1
            if (r0 != r2) goto Le
            r0 = 2
            goto L23
        Le:
            int r3 = r0 + (-1)
            int r3 = java.lang.Integer.highestOneBit(r3)
            int r3 = r3 << r2
        L15:
            double r4 = (double) r3
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r7
            double r7 = (double) r0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L22
            int r3 = r3 << 1
            goto L15
        L22:
            r0 = r3
        L23:
            char[] r3 = new char[r0]
            int r0 = r0 - r2
            int r1 = r10.nextSetBit(r1)
            r4 = 0
        L2c:
            r2 = -1
            if (r1 == r2) goto L56
            r7 = 1
            long r7 = r7 << r1
            long r7 = r7 | r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            r4 = 15
            int r2 = java.lang.Integer.rotateLeft(r2, r4)
            r4 = 461845907(0x1b873593, float:2.2368498E-22)
            int r2 = r2 * r4
        L43:
            r2 = r2 & r0
            char r4 = r3[r2]
            if (r4 != 0) goto L53
            char r4 = (char) r1
            r3[r2] = r4
            int r1 = r1 + 1
            int r1 = r10.nextSetBit(r1)
            r4 = r7
            goto L2c
        L53:
            int r2 = r2 + 1
            goto L43
        L56:
            com.google.common.base.SmallCharMatcher r10 = new com.google.common.base.SmallCharMatcher
            r2 = r10
            r7 = r11
            r2.<init>(r3, r4, r6, r7)
            return r10
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char r8) {
            r7 = this;
            if (r8 != 0) goto L5
            boolean r8 = r7.containsZero
            return r8
        L5:
            boolean r0 = r7.checkFilter(r8)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            char[] r0 = r7.table
            int r0 = r0.length
            r2 = 1
            int r0 = r0 - r2
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r8
            r4 = 15
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            r4 = 461845907(0x1b873593, float:2.2368498E-22)
            int r3 = r3 * r4
            r3 = r3 & r0
            r4 = r3
        L24:
            char[] r5 = r7.table
            char r6 = r5[r4]
            if (r6 != 0) goto L2b
            return r1
        L2b:
            char r5 = r5[r4]
            if (r5 != r8) goto L30
            return r2
        L30:
            int r4 = r4 + 1
            r4 = r4 & r0
            if (r4 != r3) goto L24
            return r1
    }

    @Override // com.google.common.base.CharMatcher
    public final void setBits(java.util.BitSet r5) {
            r4 = this;
            boolean r0 = r4.containsZero
            r1 = 0
            if (r0 == 0) goto L8
            r5.set(r1)
        L8:
            char[] r0 = r4.table
            int r2 = r0.length
        Lb:
            if (r1 >= r2) goto L17
            char r3 = r0[r1]
            if (r3 == 0) goto L14
            r5.set(r3)
        L14:
            int r1 = r1 + 1
            goto Lb
        L17:
            return
    }
}
