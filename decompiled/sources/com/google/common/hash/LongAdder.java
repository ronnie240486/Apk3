package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class LongAdder extends com.google.common.hash.Striped64 implements com.google.common.hash.LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    public LongAdder() {
            r0 = this;
            r0.<init>()
            return
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            r0 = 0
            r2.busy = r0
            r0 = 0
            r2.cells = r0
            long r0 = r3.readLong()
            r2.base = r0
            return
    }

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            r3.defaultWriteObject()
            long r0 = r2.sum()
            r3.writeLong(r0)
            return
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long r14) {
            r13 = this;
            com.google.common.hash.Striped64$Cell[] r0 = r13.cells
            if (r0 != 0) goto Le
            long r1 = r13.base
            long r3 = r1 + r14
            boolean r1 = r13.casBase(r1, r3)
            if (r1 != 0) goto L111
        Le:
            java.lang.ThreadLocal<int[]> r1 = com.google.common.hash.Striped64.threadHashCode
            java.lang.Object r2 = r1.get()
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r0 == 0) goto L32
            int r5 = r0.length
            if (r5 < r4) goto L32
            int r5 = r5 - r4
            r6 = r2[r3]
            r5 = r5 & r6
            r0 = r0[r5]
            if (r0 == 0) goto L32
            long r5 = r0.value
            long r7 = r5 + r14
            boolean r0 = r0.cas(r5, r7)
            if (r0 != 0) goto L111
            goto L33
        L32:
            r0 = 1
        L33:
            if (r2 != 0) goto L46
            int[] r2 = new int[r4]
            r1.set(r2)
            java.util.Random r1 = com.google.common.hash.Striped64.rng
            int r1 = r1.nextInt()
            if (r1 != 0) goto L43
            r1 = 1
        L43:
            r2[r3] = r1
            goto L48
        L46:
            r1 = r2[r3]
        L48:
            r5 = 0
        L49:
            com.google.common.hash.Striped64$Cell[] r6 = r13.cells
            if (r6 == 0) goto Ld9
            int r7 = r6.length
            if (r7 <= 0) goto Ld9
            int r8 = r7 + (-1)
            r8 = r8 & r1
            r8 = r6[r8]
            if (r8 != 0) goto L87
            int r6 = r13.busy
            if (r6 != 0) goto Lcb
            com.google.common.hash.Striped64$Cell r6 = new com.google.common.hash.Striped64$Cell
            r6.<init>(r14)
            int r7 = r13.busy
            if (r7 != 0) goto Lcb
            boolean r7 = r13.casBusy()
            if (r7 == 0) goto Lcb
            com.google.common.hash.Striped64$Cell[] r7 = r13.cells     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L7c
            int r8 = r7.length     // Catch: java.lang.Throwable -> L83
            if (r8 <= 0) goto L7c
            int r8 = r8 + (-1)
            r8 = r8 & r1
            r9 = r7[r8]     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L7c
            r7[r8] = r6     // Catch: java.lang.Throwable -> L83
            r6 = 1
            goto L7d
        L7c:
            r6 = 0
        L7d:
            r13.busy = r3
            if (r6 == 0) goto L49
            goto L111
        L83:
            r14 = move-exception
            r13.busy = r3
            throw r14
        L87:
            if (r0 != 0) goto L8b
            r0 = 1
            goto Lcc
        L8b:
            long r9 = r8.value
            long r11 = r13.fn(r9, r14)
            boolean r8 = r8.cas(r9, r11)
            if (r8 == 0) goto L99
            goto L111
        L99:
            int r8 = com.google.common.hash.Striped64.NCPU
            if (r7 >= r8) goto Lcb
            com.google.common.hash.Striped64$Cell[] r8 = r13.cells
            if (r8 == r6) goto La2
            goto Lcb
        La2:
            if (r5 != 0) goto La6
            r5 = 1
            goto Lcc
        La6:
            int r8 = r13.busy
            if (r8 != 0) goto Lcc
            boolean r8 = r13.casBusy()
            if (r8 == 0) goto Lcc
            com.google.common.hash.Striped64$Cell[] r5 = r13.cells     // Catch: java.lang.Throwable -> Lc7
            if (r5 != r6) goto Lc4
            int r5 = r7 << 1
            com.google.common.hash.Striped64$Cell[] r5 = new com.google.common.hash.Striped64.Cell[r5]     // Catch: java.lang.Throwable -> Lc7
            r8 = 0
        Lb9:
            if (r8 >= r7) goto Lc2
            r9 = r6[r8]     // Catch: java.lang.Throwable -> Lc7
            r5[r8] = r9     // Catch: java.lang.Throwable -> Lc7
            int r8 = r8 + 1
            goto Lb9
        Lc2:
            r13.cells = r5     // Catch: java.lang.Throwable -> Lc7
        Lc4:
            r13.busy = r3
            goto L48
        Lc7:
            r14 = move-exception
            r13.busy = r3
            throw r14
        Lcb:
            r5 = 0
        Lcc:
            int r6 = r1 << 13
            r1 = r1 ^ r6
            int r6 = r1 >>> 17
            r1 = r1 ^ r6
            int r6 = r1 << 5
            r1 = r1 ^ r6
            r2[r3] = r1
            goto L49
        Ld9:
            int r7 = r13.busy
            if (r7 != 0) goto L105
            com.google.common.hash.Striped64$Cell[] r7 = r13.cells
            if (r7 != r6) goto L105
            boolean r7 = r13.casBusy()
            if (r7 == 0) goto L105
            com.google.common.hash.Striped64$Cell[] r7 = r13.cells     // Catch: java.lang.Throwable -> L101
            if (r7 != r6) goto Lfb
            r6 = 2
            com.google.common.hash.Striped64$Cell[] r6 = new com.google.common.hash.Striped64.Cell[r6]     // Catch: java.lang.Throwable -> L101
            r7 = r1 & 1
            com.google.common.hash.Striped64$Cell r8 = new com.google.common.hash.Striped64$Cell     // Catch: java.lang.Throwable -> L101
            r8.<init>(r14)     // Catch: java.lang.Throwable -> L101
            r6[r7] = r8     // Catch: java.lang.Throwable -> L101
            r13.cells = r6     // Catch: java.lang.Throwable -> L101
            r6 = 1
            goto Lfc
        Lfb:
            r6 = 0
        Lfc:
            r13.busy = r3
            if (r6 == 0) goto L49
            goto L111
        L101:
            r14 = move-exception
            r13.busy = r3
            throw r14
        L105:
            long r6 = r13.base
            long r8 = r13.fn(r6, r14)
            boolean r6 = r13.casBase(r6, r8)
            if (r6 == 0) goto L49
        L111:
            return
    }

    public void decrement() {
            r2 = this;
            r0 = -1
            r2.add(r0)
            return
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            long r0 = r2.sum()
            double r0 = (double) r0
            return r0
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            long r0 = r2.sum()
            float r0 = (float) r0
            return r0
    }

    public final long fn(long r1, long r3) {
            r0 = this;
            long r1 = r1 + r3
            return r1
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
            r2 = this;
            r0 = 1
            r2.add(r0)
            return
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            long r0 = r2.sum()
            int r1 = (int) r0
            return r1
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            long r0 = r2.sum()
            return r0
    }

    public void reset() {
            r6 = this;
            com.google.common.hash.Striped64$Cell[] r0 = r6.cells
            r1 = 0
            r6.base = r1
            if (r0 == 0) goto L15
            int r3 = r0.length
            r4 = 0
        La:
            if (r4 >= r3) goto L15
            r5 = r0[r4]
            if (r5 == 0) goto L12
            r5.value = r1
        L12:
            int r4 = r4 + 1
            goto La
        L15:
            return
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
            r7 = this;
            long r0 = r7.base
            com.google.common.hash.Striped64$Cell[] r2 = r7.cells
            if (r2 == 0) goto L14
            int r3 = r2.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L14
            r5 = r2[r4]
            if (r5 == 0) goto L11
            long r5 = r5.value
            long r0 = r0 + r5
        L11:
            int r4 = r4 + 1
            goto L8
        L14:
            return r0
    }

    public long sumThenReset() {
            r10 = this;
            long r0 = r10.base
            com.google.common.hash.Striped64$Cell[] r2 = r10.cells
            r3 = 0
            r10.base = r3
            if (r2 == 0) goto L1a
            int r5 = r2.length
            r6 = 0
        Lc:
            if (r6 >= r5) goto L1a
            r7 = r2[r6]
            if (r7 == 0) goto L17
            long r8 = r7.value
            long r0 = r0 + r8
            r7.value = r3
        L17:
            int r6 = r6 + 1
            goto Lc
        L1a:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.sum()
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }
}
