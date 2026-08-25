package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;

    private CompactHashing() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createTable(int r3) {
            r0 = 2
            if (r3 < r0) goto L1e
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 > r0) goto L1e
            int r0 = java.lang.Integer.highestOneBit(r3)
            if (r0 != r3) goto L1e
            r0 = 256(0x100, float:3.59E-43)
            if (r3 > r0) goto L14
            byte[] r3 = new byte[r3]
            return r3
        L14:
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r3 > r0) goto L1b
            short[] r3 = new short[r3]
            return r3
        L1b:
            int[] r3 = new int[r3]
            return r3
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 52
            java.lang.String r2 = "must be power of 2 between 2^1 and 2^30: "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r3)
            throw r0
    }

    public static int newCapacity(int r1) {
            r0 = 32
            if (r1 >= r0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 2
        L7:
            int r1 = r1 + 1
            int r1 = r1 * r0
            return r1
    }

    public static int remove(@javax.annotation.CheckForNull java.lang.Object r9, @javax.annotation.CheckForNull java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, @javax.annotation.CheckForNull java.lang.Object[] r15) {
            int r0 = com.google.common.collect.Hashing.smearedHash(r9)
            r1 = r0 & r11
            int r2 = tableGet(r12, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = -1
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3b
            r7 = r14[r2]
            boolean r7 = com.google.common.base.Objects.equal(r9, r7)
            if (r7 == 0) goto L3b
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = com.google.common.base.Objects.equal(r10, r7)
            if (r7 == 0) goto L3b
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            tableSet(r12, r1, r9)
            goto L3a
        L33:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L3a:
            return r2
        L3b:
            r5 = r6 & r11
            if (r5 != 0) goto L40
            return r3
        L40:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
    }

    public static void tableClear(java.lang.Object r2) {
            boolean r0 = r2 instanceof byte[]
            r1 = 0
            if (r0 == 0) goto Lb
            byte[] r2 = (byte[]) r2
            java.util.Arrays.fill(r2, r1)
            goto L1a
        Lb:
            boolean r0 = r2 instanceof short[]
            if (r0 == 0) goto L15
            short[] r2 = (short[]) r2
            java.util.Arrays.fill(r2, r1)
            goto L1a
        L15:
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r1)
        L1a:
            return
    }

    public static int tableGet(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r1 = (byte[]) r1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
        Lb:
            boolean r0 = r1 instanceof short[]
            if (r0 == 0) goto L18
            short[] r1 = (short[]) r1
            short r1 = r1[r2]
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            return r1
        L18:
            int[] r1 = (int[]) r1
            r1 = r1[r2]
            return r1
    }

    public static void tableSet(java.lang.Object r1, int r2, int r3) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto La
            byte[] r1 = (byte[]) r1
            byte r3 = (byte) r3
            r1[r2] = r3
            goto L18
        La:
            boolean r0 = r1 instanceof short[]
            if (r0 == 0) goto L14
            short[] r1 = (short[]) r1
            short r3 = (short) r3
            r1[r2] = r3
            goto L18
        L14:
            int[] r1 = (int[]) r1
            r1[r2] = r3
        L18:
            return
    }

    public static int tableSize(int r2) {
            int r2 = r2 + 1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = com.google.common.collect.Hashing.closedTableSize(r2, r0)
            r0 = 4
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }
}
