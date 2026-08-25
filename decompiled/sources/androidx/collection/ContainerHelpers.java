package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
class ContainerHelpers {
    public static final int[] EMPTY_INTS = null;
    public static final long[] EMPTY_LONGS = null;
    public static final java.lang.Object[] EMPTY_OBJECTS = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            androidx.collection.ContainerHelpers.EMPTY_INTS = r1
            long[] r1 = new long[r0]
            androidx.collection.ContainerHelpers.EMPTY_LONGS = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.collection.ContainerHelpers.EMPTY_OBJECTS = r0
            return
    }

    private ContainerHelpers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int binarySearch(int[] r3, int r4, int r5) {
            int r4 = r4 + (-1)
            r0 = 0
        L3:
            if (r0 > r4) goto L18
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L11
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L11:
            if (r2 <= r5) goto L17
            int r1 = r1 + (-1)
            r4 = r1
            goto L3
        L17:
            return r1
        L18:
            int r3 = ~r0
            return r3
    }

    public static int binarySearch(long[] r5, int r6, long r7) {
            int r6 = r6 + (-1)
            r0 = 0
        L3:
            if (r0 > r6) goto L1a
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            r2 = r5[r1]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L13
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L13:
            if (r4 <= 0) goto L19
            int r1 = r1 + (-1)
            r6 = r1
            goto L3
        L19:
            return r1
        L1a:
            int r5 = ~r0
            return r5
    }

    public static boolean equal(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static int idealByteArraySize(int r2) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto Lf
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            return r2
    }

    public static int idealIntArraySize(int r0) {
            int r0 = r0 * 4
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 4
            return r0
    }

    public static int idealLongArraySize(int r0) {
            int r0 = r0 * 8
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 8
            return r0
    }
}
