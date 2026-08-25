package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends com.google.common.collect.CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public transient long[] links;

    public CompactLinkedHashMap() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r0 = 0
            r1.accessOrder = r0
            return
    }

    public CompactLinkedHashMap(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.accessOrder = r1
            return
    }

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> create() {
            com.google.common.collect.CompactLinkedHashMap r0 = new com.google.common.collect.CompactLinkedHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactLinkedHashMap r0 = new com.google.common.collect.CompactLinkedHashMap
            r0.<init>(r1)
            return r0
    }

    private int getPredecessor(int r3) {
            r2 = this;
            long r0 = r2.link(r3)
            r3 = 32
            long r0 = r0 >>> r3
            int r3 = (int) r0
            int r3 = r3 + (-1)
            return r3
    }

    private long link(int r4) {
            r3 = this;
            long[] r0 = r3.requireLinks()
            r1 = r0[r4]
            return r1
    }

    private long[] requireLinks() {
            r1 = this;
            long[] r0 = r1.links
            java.util.Objects.requireNonNull(r0)
            long[] r0 = (long[]) r0
            return r0
    }

    private void setLink(int r2, long r3) {
            r1 = this;
            long[] r0 = r1.requireLinks()
            r0[r2] = r3
            return
    }

    private void setPredecessor(int r5, int r6) {
            r4 = this;
            long r0 = r4.link(r5)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r6 = r6 + 1
            long r2 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            long r0 = r0 | r2
            r4.setLink(r5, r0)
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

    private void setSuccessor(int r7, int r8) {
            r6 = this;
            long r0 = r6.link(r7)
            r2 = -4294967296(0xffffffff00000000, double:NaN)
            long r0 = r0 & r2
            int r8 = r8 + 1
            long r2 = (long) r8
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            r6.setLink(r7, r0)
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void accessEntry(int r3) {
            r2 = this;
            boolean r0 = r2.accessOrder
            if (r0 == 0) goto L1b
            int r0 = r2.getPredecessor(r3)
            int r1 = r2.getSuccessor(r3)
            r2.setSucceeds(r0, r1)
            int r0 = r2.lastEntry
            r2.setSucceeds(r0, r3)
            r0 = -2
            r2.setSucceeds(r3, r0)
            r2.incrementModCount()
        L1b:
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int adjustAfterRemove(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L7
            r2 = r3
        L7:
            return r2
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int allocArrays() {
            r2 = this;
            int r0 = super.allocArrays()
            long[] r1 = new long[r0]
            r2.links = r1
            return r0
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
            r5 = this;
            boolean r0 = r5.needsAllocArrays()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = -2
            r5.firstEntry = r0
            r5.lastEntry = r0
            long[] r0 = r5.links
            if (r0 == 0) goto L1a
            r1 = 0
            int r2 = r5.size()
            r3 = 0
            java.util.Arrays.fill(r0, r1, r2, r3)
        L1a:
            super.clear()
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.util.Map<K, V> convertToHashFloodingResistantImplementation() {
            r2 = this;
            java.util.Map r0 = super.convertToHashFloodingResistantImplementation()
            r1 = 0
            r2.links = r1
            return r0
    }

    @Override // com.google.common.collect.CompactHashMap
    public final java.util.Map<K, V> createHashFloodingResistantDelegate(int r4) {
            r3 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            boolean r1 = r3.accessOrder
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r2, r1)
            return r0
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int firstEntryIndex() {
            r1 = this;
            int r0 = r1.firstEntry
            return r0
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int getSuccessor(int r3) {
            r2 = this;
            long r0 = r2.link(r3)
            int r3 = (int) r0
            int r3 = r3 + (-1)
            return r3
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void init(int r1) {
            r0 = this;
            super.init(r1)
            r1 = -2
            r0.firstEntry = r1
            r0.lastEntry = r1
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void insertEntry(int r1, @com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3, int r4, int r5) {
            r0 = this;
            super.insertEntry(r1, r2, r3, r4, r5)
            int r2 = r0.lastEntry
            r0.setSucceeds(r2, r1)
            r2 = -2
            r0.setSucceeds(r1, r2)
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void moveLastEntry(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            int r0 = r0 + (-1)
            super.moveLastEntry(r3, r4)
            int r4 = r2.getPredecessor(r3)
            int r1 = r2.getSuccessor(r3)
            r2.setSucceeds(r4, r1)
            if (r3 >= r0) goto L24
            int r4 = r2.getPredecessor(r0)
            r2.setSucceeds(r4, r3)
            int r4 = r2.getSuccessor(r0)
            r2.setSucceeds(r3, r4)
        L24:
            r3 = 0
            r2.setLink(r0, r3)
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void resizeEntries(int r2) {
            r1 = this;
            super.resizeEntries(r2)
            long[] r0 = r1.requireLinks()
            long[] r2 = java.util.Arrays.copyOf(r0, r2)
            r1.links = r2
            return
    }
}
