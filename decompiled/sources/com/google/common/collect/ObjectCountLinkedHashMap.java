package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends com.google.common.collect.ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @com.google.common.annotations.VisibleForTesting
    public transient long[] links;

    public ObjectCountLinkedHashMap() {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 3
            r2.<init>(r1, r0)
            return
    }

    public ObjectCountLinkedHashMap(int r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r0)
            return
    }

    public ObjectCountLinkedHashMap(com.google.common.collect.ObjectCountHashMap<K> r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size
            r3.init(r0)
            int r0 = r4.firstIndex()
        Lc:
            r1 = -1
            if (r0 == r1) goto L1f
            java.lang.Object r1 = r4.getKey(r0)
            int r2 = r4.getValue(r0)
            r3.put(r1, r2)
            int r0 = r4.nextIndex(r0)
            goto Lc
        L1f:
            return
    }

    private int getPredecessor(int r4) {
            r3 = this;
            long[] r0 = r3.links
            r1 = r0[r4]
            r4 = 32
            long r0 = r1 >>> r4
            int r4 = (int) r0
            return r4
    }

    private int getSuccessor(int r4) {
            r3 = this;
            long[] r0 = r3.links
            r1 = r0[r4]
            int r4 = (int) r1
            return r4
    }

    private void setPredecessor(int r6, int r7) {
            r5 = this;
            long[] r0 = r5.links
            r1 = r0[r6]
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r3 = (long) r7
            r7 = 32
            long r3 = r3 << r7
            long r1 = r1 | r3
            r0[r6] = r1
            return
    }

    private void setSucceeds(int r2, int r3) {
            r1 = this;
            r0 = -2
            if (r2 != r0) goto L6
            r1.firstEntry = r3
            goto L9
        L6:
            r1.setSuccessor(r2, r3)
        L9:
            if (r3 != r0) goto Le
            r1.lastEntry = r2
            goto L11
        Le:
            r1.setPredecessor(r3, r2)
        L11:
            return
    }

    private void setSuccessor(int r8, int r9) {
            r7 = this;
            long[] r0 = r7.links
            r1 = r0[r8]
            r3 = -4294967296(0xffffffff00000000, double:NaN)
            long r1 = r1 & r3
            long r3 = (long) r9
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            r0[r8] = r1
            return
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
            r1 = this;
            super.clear()
            r0 = -2
            r1.firstEntry = r0
            r1.lastEntry = r0
            return
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int firstIndex() {
            r2 = this;
            int r0 = r2.firstEntry
            r1 = -2
            if (r0 != r1) goto L6
            r0 = -1
        L6:
            return r0
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void init(int r3) {
            r2 = this;
            super.init(r3)
            r0 = -2
            r2.firstEntry = r0
            r2.lastEntry = r0
            long[] r3 = new long[r3]
            r2.links = r3
            r0 = -1
            java.util.Arrays.fill(r3, r0)
            return
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void insertEntry(int r1, @com.google.common.collect.ParametricNullness K r2, int r3, int r4) {
            r0 = this;
            super.insertEntry(r1, r2, r3, r4)
            int r2 = r0.lastEntry
            r0.setSucceeds(r2, r1)
            r2 = -2
            r0.setSucceeds(r1, r2)
            return
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void moveLastEntry(int r4) {
            r3 = this;
            int r0 = r3.size
            int r0 = r0 + (-1)
            int r1 = r3.getPredecessor(r4)
            int r2 = r3.getSuccessor(r4)
            r3.setSucceeds(r1, r2)
            if (r4 >= r0) goto L1f
            int r1 = r3.getPredecessor(r0)
            r3.setSucceeds(r1, r4)
            int r0 = r3.getSuccessor(r0)
            r3.setSucceeds(r4, r0)
        L1f:
            super.moveLastEntry(r4)
            return
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int nextIndex(int r2) {
            r1 = this;
            int r2 = r1.getSuccessor(r2)
            r0 = -2
            if (r2 != r0) goto L8
            r2 = -1
        L8:
            return r2
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int nextIndexAfterRemove(int r2, int r3) {
            r1 = this;
            int r0 = r1.size
            if (r2 != r0) goto L5
            r2 = r3
        L5:
            return r2
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void resizeEntries(int r5) {
            r4 = this;
            super.resizeEntries(r5)
            long[] r0 = r4.links
            int r1 = r0.length
            long[] r0 = java.util.Arrays.copyOf(r0, r5)
            r4.links = r0
            r2 = -1
            java.util.Arrays.fill(r0, r1, r5, r2)
            return
    }
}
