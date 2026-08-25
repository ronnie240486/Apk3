package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int closedTableSize(int r3, double r4) {
            r0 = 2
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Integer.highestOneBit(r3)
            double r1 = (double) r0
            double r4 = r4 * r1
            int r4 = (int) r4
            if (r3 <= r4) goto L17
            int r3 = r0 << 1
            if (r3 <= 0) goto L14
            goto L16
        L14:
            r3 = 1073741824(0x40000000, float:2.0)
        L16:
            return r3
        L17:
            return r0
    }

    public static int smear(int r4) {
            long r0 = (long) r4
            r2 = -862048943(0xffffffffcc9e2d51, double:NaN)
            long r0 = r0 * r2
            int r4 = (int) r0
            r0 = 15
            int r4 = java.lang.Integer.rotateLeft(r4, r0)
            long r0 = (long) r4
            r2 = 461845907(0x1b873593, double:2.281821963E-315)
            long r0 = r0 * r2
            int r4 = (int) r0
            return r4
    }

    public static int smearedHash(@javax.annotation.CheckForNull java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r0 = smear(r0)
            return r0
    }
}
